package ua.lviv.javaclub.githubcopilotdemo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Controller for User entity.
 */
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * Get list of all JavaClub users.
     *
     * <p>Example:
     * <pre>{@code
     * curl -X GET http://localhost:8080/users
     * }</pre>
     * </p>
     *
     * @return list of users
     */
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    // TODO: 2.2) Add documentation
    @GetMapping("/{id}")
    public User getUser(@NonNull @PathVariable final Long id) {
        return userService.getUser(id);
    }

    // TODO: 4.0) create a 4.2 and 4.3 tasks
    // TODO: 4.1) Add to the REST API the ability to change the status from CREATED to VALID.
}
