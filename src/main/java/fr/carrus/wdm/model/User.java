package fr.carrus.wdm.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"user\"")
public class User extends AbstractEntity {
    @Size(max = 25)
    @Column(name = "status", length = 25)
    private String status;

    @Size(max = 45)
    @Column(name = "pseudo", length = 45)
    private String pseudo;

    @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;

    @Lob
    @Column(name = "picture")
    private String picture;

    @Size(max = 45)
    @Column(name = "first_name", length = 45)
    private String firstName;

    @Size(max = 45)
    @Column(name = "last_name", length = 45)
    private String lastName;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

    @Column(name = "failed_login_count")
    private Integer failedLoginCount;

    @Size(max = 25)
    @Column(name = "password", length = 25)
    private String password;

    @Size(max = 25)
    @Column(name = "last_modify_password", length = 25)
    private String lastModifyPassword;

    @Column(name = "timezone")
    private LocalDateTime timezone;

    @Column(name = "last_visit_date")
    private LocalDateTime lastVisitDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_policy",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_ability"))
    private List<Ability> abilities;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_preference_value",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_preference"))
    private List<Preference> preferences;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_membership",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_user_group"))
    private List<UserGroup> userMemberShip;
}
