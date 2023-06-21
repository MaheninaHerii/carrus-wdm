package fr.carrus.wdm.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class FunctionalDomain extends AbstractEntity {
    @OneToMany(mappedBy = "functionalDomain", cascade = CascadeType.ALL)
    private List<Role> roleList;
}
