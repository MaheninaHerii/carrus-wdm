package fr.carrus.wdm.services;

import fr.carrus.wdm.dtos.AbilityDto;

import java.util.List;


public interface AbilityService {
    AbilityDto create(AbilityDto abilityDto);
    AbilityDto findById(Long id);
    List<AbilityDto> findAll();
    void delete(Long id);
    void modify(Long id, AbilityDto abilityDto);
}
