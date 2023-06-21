package fr.carrus.wdm.services.Impl;

import fr.carrus.wdm.dtos.FunctionalDomainDto;
import fr.carrus.wdm.services.FunctionalDomainService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionalDomainServiceImpl implements FunctionalDomainService {
    @Override
    public FunctionalDomainDto create(FunctionalDomainDto functionalDomainDto) {
        return null;
    }

    @Override
    public FunctionalDomainDto findById(Long id) {
        return null;
    }

    @Override
    public List<FunctionalDomainDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void modify(Long id, FunctionalDomainDto functionalDomainDto) {

    }
}
