package fr.carrus.wdm.services.Impl;

import fr.carrus.wdm.dtos.UserGroupDto;
import fr.carrus.wdm.services.UserGroupService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupServiceImpl implements UserGroupService {
    @Override
    public UserGroupDto create(UserGroupDto userGroupDto) {
        return null;
    }

    @Override
    public UserGroupDto findById(Long id) {
        return null;
    }

    @Override
    public List<UserGroupDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void modify(Long id, UserGroupDto userGroupDto) {

    }
}
