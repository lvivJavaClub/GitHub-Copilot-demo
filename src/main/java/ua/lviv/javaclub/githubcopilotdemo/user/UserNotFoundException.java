package ua.lviv.javaclub.githubcopilotdemo.user;

import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * Exception for User not found.
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User Not Found")
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(@NonNull final Long id) {
        super("User with id " + id + " not found");
    }
}
