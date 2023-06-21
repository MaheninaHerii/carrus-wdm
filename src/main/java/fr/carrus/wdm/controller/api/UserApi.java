package fr.carrus.wdm.controller.api;

import fr.carrus.wdm.dtos.UserDto;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
public interface UserApi {
    @PostMapping(value = "/user/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserDto> create(@RequestBody UserDto userDto);

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserDto> findById(@PathVariable Long id);

    @GetMapping(value = "/list/user", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<UserDto>> findAll();

    @DeleteMapping(value = "/delete/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity delete(@PathVariable Long id);

    @PutMapping(value = "/update/user/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    RequestEntity modify(Long id, @RequestBody UserDto userDto);
}
