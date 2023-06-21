package fr.carrus.wdm.services.Impl;

import fr.carrus.wdm.dtos.PreferenceDto;
import fr.carrus.wdm.services.PreferenceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceServiceImpl implements PreferenceService {
    @Override
    public PreferenceDto create(PreferenceDto preferenceDto) {
        return null;
    }

    @Override
    public PreferenceDto findById(Long id) {
        return null;
    }

    @Override
    public List<PreferenceDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void modify(Long id, PreferenceDto preferenceDto) {

    }
}
