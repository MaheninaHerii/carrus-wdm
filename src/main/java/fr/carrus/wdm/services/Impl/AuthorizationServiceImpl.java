package fr.carrus.wdm.services.Impl;

import fr.carrus.wdm.dtos.AuthorizationDto;
import fr.carrus.wdm.services.AuthorizationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    @Override
    public AuthorizationDto create(AuthorizationDto authorizationDto) {
        return null;
    }

    @Override
    public AuthorizationDto findById(Long id) {
        return null;
    }

    @Override
    public List<AuthorizationDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void modify(Long id, AuthorizationDto authorizationDto) {

    }
}
