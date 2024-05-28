package ua.lviv.javaclub.githubcopilotdemo.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.OffsetDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void getUser() {
        final User user = User.builder()
                .name("name")
                .createdAt(OffsetDateTime.now())
                .build();
        userRepository.save(user);

        final Optional<User> actual = userRepository.findById(user.getId());

        assertNotNull(actual);
        assertTrue(actual.isPresent());
        assertEquals("name", actual.get().getName());
    }
}