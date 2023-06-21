package fr.carrus.wdm.dtos;

import fr.carrus.wdm.model.Ability;
import fr.carrus.wdm.model.Preference;
import fr.carrus.wdm.model.User;
import fr.carrus.wdm.model.UserGroup;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class UserDto {
    private long id;
    private String name;
    private String description;
    private String status;
    private String pseudo;
    private String email;
    private String picture;
    private String firstName;
    private String lastName;
    private Integer failedLoginCount;
    private LocalDateTime timezone;
    private LocalDateTime lastVisitDate;
    private List<AbilityDto> abilities;
    private List<PreferenceDto> preferences;
    private List<UserGroupDto> userMemberShip;

    public static UserDto fromEntity(User user) {
        if(user == null) {
            //TODO Throws Exception
            return null;
        }

        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .description(user.getDescription())
                .status(user.getStatus())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .picture(user.getPicture())
                .pseudo(user.getPseudo())
                .failedLoginCount(user.getFailedLoginCount())
                .lastVisitDate(user.getLastVisitDate())
                .abilities(user.getAbilities() != null ?
                        user.getAbilities().stream().map(AbilityDto::fromEntity).collect(Collectors.toList()):null)
                .preferences(user.getPreferences() != null ?
                        user.getPreferences().stream().map(PreferenceDto::fromEntity).collect(Collectors.toList()):null)
                .userMemberShip(user.getUserMemberShip() != null ?
                        user.getUserMemberShip().stream().map(UserGroupDto::fromEntity).collect(Collectors.toList()):null).build();

    }
    public static User toEntity(UserDto userDto) {
        if(userDto == null) {
            //TODO Throws Exception
            return null;
        }

        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setDescription(userDto.getDescription());
        user.setStatus(userDto.getStatus());
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPicture(userDto.getPicture());
        user.setPseudo(userDto.getPseudo());
        user.setFailedLoginCount(userDto.getFailedLoginCount());
        user.setLastVisitDate(userDto.getLastVisitDate());
        user.setAbilities(userDto.getAbilities() != null ?
                userDto.getAbilities().stream().map(AbilityDto::toEntity).collect(Collectors.toList()):null);
        user.setPreferences(userDto.getPreferences() != null ?
                userDto.getPreferences().stream().map(PreferenceDto::toEntity).collect(Collectors.toList()):null);
        user.setUserMemberShip(userDto.getUserMemberShip() != null ?
                userDto.getUserMemberShip().stream().map(UserGroupDto::toEntity).collect(Collectors.toList()):null);

        return user;
    }
}
