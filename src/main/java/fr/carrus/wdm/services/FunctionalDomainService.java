package fr.carrus.wdm.services;

import fr.carrus.wdm.dtos.AuthorizationDto;
import fr.carrus.wdm.dtos.FunctionalDomainDto;

import java.util.List;

public interface FunctionalDomainService {
    FunctionalDomainDto create(FunctionalDomainDto functionalDomainDto);
    FunctionalDomainDto findById(Long id);
    List<FunctionalDomainDto> findAll();
    void delete(Long id);
    void modify(Long id, FunctionalDomainDto functionalDomainDto);
}
