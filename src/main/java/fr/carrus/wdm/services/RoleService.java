package fr.carrus.wdm.services;

import fr.carrus.wdm.dtos.RoleDto;

import java.util.List;

public interface RoleService {
    RoleDto create(RoleDto roleDto);
    RoleDto findById(Long id);
    List<RoleDto> findAll();

    void delete(Long id);
    void modify(Long id, RoleDto roleDto);
}
