package adapter.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoginTest {
    @Test
    public void testClients() {
        Login login = new Login();
        assertTrue(login.login("facebook") instanceof FacebookClient);
        assertTrue(login.login("twitter") instanceof TwitterClient);
    }
}