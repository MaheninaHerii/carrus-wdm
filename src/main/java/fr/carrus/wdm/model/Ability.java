package fr.carrus.wdm.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ability extends AbstractEntity {

    @ManyToMany(mappedBy = "abilities")
    private List<User> users = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ability_authorization",
            joinColumns = @JoinColumn(name = "id_ability"),
            inverseJoinColumns = @JoinColumn(name = "id_authorization"))
    private List<Authorization> authorizations;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "role_ability",
            joinColumns = @JoinColumn(name = "id_ability"),
            inverseJoinColumns = @JoinColumn(name = "id_role"))
    private List<Role> roles;

    @ManyToMany(mappedBy = "userGroupPolicy")
    private List<UserGroup> userGroups;
}
