package adapter.task3;

public class Auth extends Авторизація {
    public boolean authorize(БазаДаних db) {
        return авторизуватися(db);
    }
}
