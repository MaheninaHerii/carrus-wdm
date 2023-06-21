package fr.carrus.wdm.dao;

import fr.carrus.wdm.model.FunctionalDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FunctionalDomainRepository extends JpaRepository<FunctionalDomain, Long> {
}
