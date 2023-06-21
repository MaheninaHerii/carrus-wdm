package fr.carrus.wdm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Preference extends AbstractEntity {
    @Size(max = 100)
    @Column(name = "value_type", length = 100)
    private String valueType;

    @Size(max = 100)
    @Column(name = "default_value", length = 100)
    private String defaultValue;

    @Size(max = 100)
    @Column(name = "possible_value", length = 100)
    private String possibleValue;

    @ManyToMany(mappedBy = "preferences")
    private List<User> users;

    @ManyToMany(mappedBy = "preferencesGroup")
    private List<UserGroup> userGroup;
}
