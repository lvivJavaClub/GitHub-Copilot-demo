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
     * Get list of all users.
     *
     * @return list of users
     */
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    /**
     * Get user info by id.
     *
     * @param id user id
     * @return user
     */
    @GetMapping("/{id}")
    public User getUser(@NonNull @PathVariable final Long id) {
        return userService.getUser(id);
    }

    // TODO 4) Add to the REST API the ability to change the status from CREATED to VALID
}
