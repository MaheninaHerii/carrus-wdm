package fr.carrus.wdm.services;

import fr.carrus.wdm.dtos.PreferenceDto;

import java.util.List;

public interface PreferenceService {
    PreferenceDto create(PreferenceDto preferenceDto);
    PreferenceDto findById(Long id);
    List<PreferenceDto> findAll();
    void delete(Long id);
    void modify(Long id, PreferenceDto preferenceDto);
}
