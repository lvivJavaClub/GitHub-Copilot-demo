package ua.lviv.javaclub.githubcopilotdemo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service for User entity.
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transient
    public User getUser(@NonNull final Long id) {  // TODO: 2.1) Add documentation
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    /**
     * Get list of all JavaClub users.
     *
     * <p>Let's become the best together</p>
     *
     * @return list of users
     */
    @Transient
    public List<User> getUsers() { // TODO: 1.1) Auto fix
        return userRepository.findAllBy();
    }

    // TODO: 2,3) Add Method to get oldest users
    // User getOldestUser() getOldesUser()
}
