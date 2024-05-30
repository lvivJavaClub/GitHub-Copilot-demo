package ua.lviv.javaclub.githubcopilotdemo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

import static ua.lviv.javaclub.githubcopilotdemo.user.UserStatus.VALID;


/**
 * Service for User entity.
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    /**
     * Get JavaClub user by id.
     *
     * <p>Let's become the best together</p>
     *
     * @param id user id
     * @return user
     */
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
    public List<User> getUsers() { // TODO: - 1.1) Auto fix javadoc
        return userRepository.findAllBy();
    }

    // TODO: - 2,3) Add Method to get oldest users
    // User getOldestUser() getOldesUser()

    User getOldestUser() {
        return userRepository.findFirstByOrderByAgeDesc();
    }

    public User changeUserStatus(Long id, UserStatus newStatus) {
        User user = getUser(id);
        user.setStatus(newStatus);
        return userRepository.save(user);
    }

    public User validateUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
        user.setStatus(VALID);
        return userRepository.save(user);
    }
}
