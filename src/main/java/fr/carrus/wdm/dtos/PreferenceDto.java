package fr.carrus.wdm.dtos;

import fr.carrus.wdm.model.Preference;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
public class PreferenceDto {
    private long id;
    private String name;
    private String description;
    private String valueType;
    private String defaultValue;
    private String possibleValue;
    private List<UserDto> users;
    private List<UserGroupDto> userGroup;

    public static PreferenceDto fromEntity(Preference preference) {
        if(preference == null) {
            //TODO Throws Exception
            return null;
        }

        return PreferenceDto.builder()
                .id(preference.getId())
                .name(preference.getName())
                .description(preference.getDescription())
                .valueType(preference.getValueType())
                .defaultValue(preference.getDefaultValue())
                .possibleValue(preference.getPossibleValue())
                .users(preference.getUsers() != null ?
                        preference.getUsers().stream().map(UserDto::fromEntity).collect(Collectors.toList()):null).build();
    }

    public static Preference toEntity(PreferenceDto preferenceDto) {
        if(preferenceDto == null) {
            //TODO Throws Exception
            return null;
        }

        Preference preference = new Preference();
        preference.setId(preferenceDto.getId());
        preference.setName(preferenceDto.getName());
        preference.setDescription(preferenceDto.getDescription());
        preference.setValueType(preferenceDto.getValueType());
        preference.setDefaultValue(preferenceDto.getDefaultValue());
        preference.setPossibleValue(preferenceDto.getPossibleValue());
        preference.setUsers(preferenceDto.getUsers() != null ?
                preferenceDto.getUsers().stream().map(UserDto::toEntity).collect(Collectors.toList()):null);

        return preference;
    }
}
