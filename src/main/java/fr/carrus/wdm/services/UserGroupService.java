package fr.carrus.wdm.services;

import fr.carrus.wdm.dtos.UserGroupDto;

import java.util.List;

public interface UserGroupService {
    UserGroupDto create(UserGroupDto userGroupDto);
    UserGroupDto findById(Long id);
    List<UserGroupDto> findAll();
    void delete(Long id);
    void modify(Long id, UserGroupDto userGroupDto);
}
