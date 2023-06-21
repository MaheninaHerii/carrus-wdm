package fr.carrus.wdm.dtos;

import fr.carrus.wdm.model.FunctionalDomain;
import fr.carrus.wdm.model.Role;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class FunctionalDomainDto {
    private long id;
    private String name;
    private String description;
    private List<RoleDto> roleList;

    public static FunctionalDomainDto fromEntity(FunctionalDomain domain) {
        if(domain == null) {
            //TODO Throws Exception
            return null;
        }
        return FunctionalDomainDto.builder()
                .id(domain.getId())
                .name(domain.getName())
                .description(domain.getDescription())
                .roleList(domain.getRoleList() != null ?
                        domain.getRoleList().stream().map(RoleDto::fromEntity).collect(Collectors.toList()):null).build();
    }

    public static FunctionalDomain toEntity(FunctionalDomainDto domainDto) {
        if(domainDto == null) {
            //TODO Throws Exception
            return null;
        }

        FunctionalDomain domain = new FunctionalDomain();
        domain.setId(domainDto.getId());
        domain.setName(domainDto.getName());
        domain.setDescription(domainDto.getDescription());
        domain.setRoleList(domainDto.getRoleList() != null ?
                domainDto.getRoleList().stream().map(RoleDto::toEntity).collect(Collectors.toList()):null);

        return domain;
    }
}
