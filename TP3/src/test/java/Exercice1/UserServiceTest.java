package Exercice1;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    @Test
    public void getUserByIdTest() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);

        User mocUser = new User("Amine Beghdad");
        Mockito.when(userRepository.findUserById(0L)).thenReturn(mocUser);

        UserService userService = new UserService(userRepository);

        User relUser = userService.getUserById(0L);

        Mockito.verify(userRepository).findUserById(0L);

        assertEquals(mocUser, relUser);
    }
}

