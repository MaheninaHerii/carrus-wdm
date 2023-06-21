package fr.carrus.wdm.services.Impl;

import fr.carrus.wdm.dtos.RoleDto;
import fr.carrus.wdm.services.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public RoleDto create(RoleDto roleDto) {
        return null;
    }

    @Override
    public RoleDto findById(Long id) {
        return null;
    }

    @Override
    public List<RoleDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void modify(Long id, RoleDto roleDto) {

    }
}
