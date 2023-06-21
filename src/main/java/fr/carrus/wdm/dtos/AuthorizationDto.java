package fr.carrus.wdm.dtos;

import fr.carrus.wdm.model.Ability;
import fr.carrus.wdm.model.Authorization;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class AuthorizationDto {
    private long id;
    private String name;
    private String description;
    private List<AbilityDto> abilities;

    public static AuthorizationDto fromEntity(Authorization authorization) {
        if(authorization == null) {
            //TODO Throws Exception
            return null;
        }

        return AuthorizationDto.builder()
                .id(authorization.getId())
                .name(authorization.getName())
                .description(authorization.getDescription())
                .abilities(authorization.getAbilities() != null ?
                        authorization.getAbilities().stream().map(AbilityDto::fromEntity).collect(Collectors.toList()):null).build();

    }

    public static Authorization toEntity(AuthorizationDto authorizationDto) {
        if(authorizationDto == null) {
            //TODO Throws Exception
            return null;
        }

        Authorization authorization = new Authorization();
        authorization.setId(authorizationDto.getId());
        authorization.setName(authorizationDto.getName());
        authorization.setDescription(authorizationDto.getDescription());
        authorization.setAbilities(authorizationDto.getAbilities() != null ?
                authorizationDto.getAbilities().stream().map(AbilityDto::toEntity).collect(Collectors.toList()):null);

        return authorization;
    }
}
