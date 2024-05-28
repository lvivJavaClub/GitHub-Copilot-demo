package ua.lviv.javaclub.githubcopilotdemo.user;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    @Test
    void getUser() {
        final Long id = 100500L;
        final User user = User.builder()
                .build();

        doReturn(Optional.of(user)).when(userRepository).findById(id);

        final User actual = userService.getUser(id);

        verify(userRepository).findById(id);

        assertNotNull(actual);
        assertEquals(user, actual);
    }
}
