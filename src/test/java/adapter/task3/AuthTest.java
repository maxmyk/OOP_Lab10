package adapter.task3;

import adapter.task2.FacebookClient;
import adapter.task2.Login;
import adapter.task2.TwitterClient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthTest {

    @Test
    public void testAuth() {
        Database db = new Database();
        Auth auth = new Auth();
        assertTrue(auth.authorize(db));
    }

}