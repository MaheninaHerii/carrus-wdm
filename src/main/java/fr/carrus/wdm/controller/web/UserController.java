package fr.carrus.wdm.controller.web;

import fr.carrus.wdm.controller.api.UserApi;
import fr.carrus.wdm.dtos.UserDto;
import fr.carrus.wdm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserApi {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<UserDto> create(UserDto userDto) {
        UserDto createdUser = userService.create(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @Override
    public ResponseEntity<UserDto> findById(Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<UserDto>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity delete(Long id) {
        return null;
    }

    @Override
    public RequestEntity modify(Long id, UserDto userDto) {
        return null;
    }
}
