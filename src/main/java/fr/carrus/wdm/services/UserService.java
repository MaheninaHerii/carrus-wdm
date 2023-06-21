package fr.carrus.wdm.services;

import fr.carrus.wdm.dtos.UserDto;

import java.util.List;

public interface UserService {
    UserDto create(UserDto userDto);
    UserDto findById(Long id);
    List<UserDto> findAll();
    void delete(Long id);
    void modify(Long id, UserDto userDto);
}
