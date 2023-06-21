package fr.carrus.wdm.services;

import fr.carrus.wdm.dtos.AbilityDto;
import fr.carrus.wdm.dtos.AuthorizationDto;

import java.util.List;

public interface AuthorizationService {
    AuthorizationDto create(AuthorizationDto authorizationDto);
    AuthorizationDto findById(Long id);
    List<AuthorizationDto> findAll();
    void delete(Long id);
    void modify(Long id, AuthorizationDto authorizationDto);
}
