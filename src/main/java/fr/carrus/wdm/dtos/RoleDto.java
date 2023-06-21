package fr.carrus.wdm.dtos;

import fr.carrus.wdm.model.Role;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class RoleDto {
    private long id;
    private String name;
    private String description;
    private List<AbilityDto> abilities;
    private FunctionalDomainDto functionalDomain;

    public static RoleDto fromEntity(Role role) {
        if(role == null) {
            //TODO Throws Exception
            return null;
        }

        return RoleDto.builder()
                .id(role.getId())
                .name(role.getName())
                .description(role.getDescription())
                .abilities(role.getAbilities() != null ?
                        role.getAbilities().stream().map(AbilityDto::fromEntity).collect(Collectors.toList()):null)
                .functionalDomain(FunctionalDomainDto.fromEntity(role.getFunctionalDomain())).build();
    }

    public static Role toEntity(RoleDto roleDto) {
        if(roleDto == null) {
            //TODO Throws Exception
            return null;
        }
        Role role = new Role();
        role.setId(roleDto.getId());
        role.setName(roleDto.getName());
        role.setDescription(roleDto.getDescription());
        role.setAbilities(roleDto.getAbilities() != null ?
                roleDto.getAbilities().stream().map(AbilityDto::toEntity).collect(Collectors.toList()):null);

        return role;
    }
}
