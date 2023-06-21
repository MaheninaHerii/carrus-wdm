package fr.carrus.wdm.services.Impl;

import fr.carrus.wdm.dao.AbilityRepository;
import fr.carrus.wdm.dao.PreferenceRepository;
import fr.carrus.wdm.dao.UserGroupRepository;
import fr.carrus.wdm.dao.UserRepository;
import fr.carrus.wdm.dtos.UserDto;
import fr.carrus.wdm.exceptions.EntityNotFoundException;
import fr.carrus.wdm.model.User;
import fr.carrus.wdm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final AbilityRepository abilityRepository;
    private final PreferenceRepository preferenceRepository;
    private final UserGroupRepository userGroupRepository;
    @Autowired
    public UserServiceImpl(UserRepository repository, AbilityRepository abilityRepository, PreferenceRepository preferenceRepository, UserGroupRepository userGroupRepository) {
        this.userRepository = repository;
        this.abilityRepository = abilityRepository;
        this.preferenceRepository = preferenceRepository;
        this.userGroupRepository = userGroupRepository;
    }

    @Override
    public UserDto create(UserDto userDto) {
        if(userDto == null) {
            //TODO throw new InvalidException for User
            return null;
        }
        return UserDto.fromEntity(userRepository.save(UserDto.toEntity(userDto)));
    }

    @Override
    public UserDto findById(Long id) {
        if(id == null) {
            //TODO throw new InvalidException for User
            return null;
        }
        Optional<User> user = userRepository.findById(id);
        UserDto userDto = UserDto.fromEntity(user.get());
        return Optional.of(userDto).orElseThrow(()->new EntityNotFoundException("Aucun User avec l'Id = "+ id +"n'etes trouvé dans la BDD"));
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream()
                .map(UserDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        if(id == null) {
            //TODO throw new InvalidException for User
        }
        userRepository.deleteById(id);
    }

    @Override
    public void modify(Long id, UserDto userDto) {
        if(id == null) {
            //TODO throw new InvalidException for User
        }
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aucun User avec l'Id = "+ id +"n'etes trouvé dans la BDD"));

    }
}
