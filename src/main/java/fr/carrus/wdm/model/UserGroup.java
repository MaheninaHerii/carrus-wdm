package fr.carrus.wdm.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserGroup extends AbstractEntity {
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_group_preference_value",
            joinColumns = @JoinColumn(name = "id_user_group"),
            inverseJoinColumns = @JoinColumn(name = "id_preference"))
    private List<Preference> preferencesGroup;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_group_policy",
            joinColumns = @JoinColumn(name = "id_user_group"),
            inverseJoinColumns = @JoinColumn(name = "id_ability"))
    private List<Ability> userGroupPolicy;

    @ManyToMany(mappedBy = "userMemberShip")
    private List<User> users;
}
