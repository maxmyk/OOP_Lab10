package adapter.task3;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Auth auth = new Auth();
//        db.Авторизація авторизація = new db.Авторизація();
        if (auth.authorize(db)) {
            ReportBuilder rb = new ReportBuilder(db);
        }
    }
}
