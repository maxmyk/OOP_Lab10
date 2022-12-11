package singleton;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String email;
    private int age;

    public void save() {
        Connection connection = Connection.getInstance();
        connection.executeQuery(String.format("insert into user (email, name, age) values ('%s', '%s', %d);", email, name, age));
    }
}
