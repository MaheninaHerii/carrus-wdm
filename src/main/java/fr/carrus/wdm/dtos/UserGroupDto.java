package fr.carrus.wdm.dtos;

import fr.carrus.wdm.model.UserGroup;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class UserGroupDto {
    private long id;
    private String name;
    private String description;
    private List<PreferenceDto> preferencesGroup;
    private List<AbilityDto> userGroupPolicy;
    private List<UserDto> users;

    public static UserGroupDto fromEntity(UserGroup userGroup) {
        if(userGroup == null) {
            //TODO Throws Exception
            return null;
        }

        return UserGroupDto.builder()
                .id(userGroup.getId())
                .name(userGroup.getName())
                .description(userGroup.getDescription())
                .users(userGroup.getUsers() != null ?
                        userGroup.getUsers().stream().map(UserDto::fromEntity).collect(Collectors.toList()):null)
                .preferencesGroup(userGroup.getPreferencesGroup() != null ?
                        userGroup.getPreferencesGroup().stream().map(PreferenceDto::fromEntity).collect(Collectors.toList()):null)
                .userGroupPolicy(userGroup.getUserGroupPolicy() != null ?
                        userGroup.getUserGroupPolicy().stream().map(AbilityDto::fromEntity).collect(Collectors.toList()):null).build();
    }

    public static UserGroup toEntity(UserGroupDto userGroupDto) {
        if(userGroupDto == null) {
            //TODO Throws Exception
            return null;
        }
        UserGroup userGroup = new UserGroup();
        userGroup.setId(userGroupDto.getId());
        userGroup.setName(userGroupDto.getName());
        userGroup.setDescription(userGroupDto.getDescription());
        userGroup.setUsers(userGroupDto.getUsers() != null ?
                userGroupDto.getUsers().stream().map(UserDto::toEntity).collect(Collectors.toList()):null);
        userGroup.setPreferencesGroup(userGroupDto.getPreferencesGroup() != null ?
                userGroupDto.getPreferencesGroup().stream().map(PreferenceDto::toEntity).collect(Collectors.toList()):null);
        userGroup.setUserGroupPolicy(userGroupDto.getUserGroupPolicy() != null ?
                userGroupDto.getUserGroupPolicy().stream().map(AbilityDto::toEntity).collect(Collectors.toList()):null);

        return userGroup;
    }
}
