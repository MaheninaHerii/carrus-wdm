package fr.carrus.wdm.dtos;


import fr.carrus.wdm.model.Ability;
import lombok.Builder;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class AbilityDto {
    private long id;
    private String name;
    private String description;
    private List<UserDto> users;
    private List<AuthorizationDto> authorizations;
    private List<RoleDto> roles;
    private List<UserGroupDto> userGroups;

    public static AbilityDto fromEntity(Ability ability) {
        if(ability == null) {
            //TODO Throws Exception
            return null;
        }

        return AbilityDto.builder()
                .id(ability.getId())
                .name(ability.getName())
                .description(ability.getDescription())
                .users(
                        ability.getUsers() != null ?
                                ability.getUsers().stream().map(UserDto::fromEntity).collect(Collectors.toList()):null)
                .authorizations(ability.getAuthorizations() != null ?
                        ability.getAuthorizations().stream().map(AuthorizationDto::fromEntity).collect(Collectors.toList()):null)
                .roles(ability.getRoles() != null ?
                        ability.getRoles().stream().map(RoleDto::fromEntity).collect(Collectors.toList()):null)
                .userGroups(ability.getUserGroups() != null ?
                        ability.getUserGroups().stream().map(UserGroupDto::fromEntity).collect(Collectors.toList()):null).build();
    }
    public  static Ability toEntity(AbilityDto abilityDto) {
        if(abilityDto == null) {
            //TODO Throws Exception
            return null;
        }

        Ability ability = new Ability();
        ability.setId(abilityDto.getId());
        ability.setName(abilityDto.getName());
        ability.setDescription(abilityDto.getDescription());
        ability.setUsers(abilityDto.getUsers() != null ?
                abilityDto.getUsers().stream().map(UserDto::toEntity).collect(Collectors.toList()):null);
        ability.setAuthorizations(abilityDto.getAuthorizations() != null ?
                abilityDto.getAuthorizations().stream().map(AuthorizationDto::toEntity).collect(Collectors.toList()):null);
        ability.setRoles(abilityDto.getRoles() != null ?
                abilityDto.getRoles().stream().map(RoleDto::toEntity).collect(Collectors.toList()):null);
        ability.setUserGroups(abilityDto.getUserGroups() != null ?
                abilityDto.getUserGroups().stream().map(UserGroupDto::toEntity).collect(Collectors.toList()):null);
        return ability;
    }
}
