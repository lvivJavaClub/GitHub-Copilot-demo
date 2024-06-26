package ua.lviv.javaclub.githubcopilotdemo.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;


/**
 * User entity.
 */
@Builder
@Getter
@Setter
@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
// TODO: 6) Define order of annotations: @Entity, @Builder, @Getter, @AllArgsConstructor, @NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private UserStatus status = UserStatus.CREATED;

    // TODO: 3.1) Add user status. Users can have the following statuses: CREATED, VALID, BLOCKED. The user is   created with the status CREATED.
    private OffsetDateTime createdAt;

    private Integer age;

}
