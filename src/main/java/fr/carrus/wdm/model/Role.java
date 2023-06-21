package fr.carrus.wdm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class Role extends AbstractEntity {
    @ManyToMany(mappedBy = "roles")
    private List<Ability> abilities;

    @ManyToOne
    @JoinColumn(name = "id_functional_domain")
    private FunctionalDomain functionalDomain;
}
