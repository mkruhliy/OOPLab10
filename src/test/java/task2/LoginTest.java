package task2;

import adapter.task2.Client;
import adapter.task2.Login;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
    private Login login;

    @BeforeEach
    public void init() {
        login = new Login();
    }

    @Test
    public void testTwitter() {
        Client twitterClient = login.login("twitter");
        assertEquals(twitterClient.getEmail(), "dobosevych@gmail.com");
        assertEquals(twitterClient.getCountry(), "Ukraine");
        assertEquals(twitterClient.getLastActiveTime(), LocalDate.of(2022, 11, 21));
    }

    @Test
    public void testFacebook() {
        Client facebookClient = login.login("facebook");
        assertEquals(facebookClient.getEmail(), "dobosevych@gmail.com");
        assertEquals(facebookClient.getCountry(), "Ukraine");
        assertEquals(facebookClient.getLastActiveTime(), LocalDate.now());
    }
}