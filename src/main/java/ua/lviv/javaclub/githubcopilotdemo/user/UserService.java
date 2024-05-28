package ua.lviv.javaclub.githubcopilotdemo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Service for User entity.
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    // TODO: 2 Add documentation
    @Transient
    public User getUser(@NonNull final Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    // TODO: 1 Auto fix
    @Transient
    public List<User> getUsers() {
        int i = 0;
        List<Long> a = userRepository.findAllIdsBy();
        List<User> r = new ArrayList<>();
        for (; i < a.size(); i++) {
            r.add(userRepository.findById(a.get(i)).get());
        }
        i ++;
        return r;
    }
}
