package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    private static final String userREGEX = "^([A-Za-z])([A-Za-z0-9]{7,})$";
    private static final String passREGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]){12,}$";

    public User() {
    }

    public String setUserName(String name) {
        String tmp_str = userName;
        if (name.matches(userREGEX))
        {
            userName = name;
            return tmp_str;
        }
        throw new RuntimeException();
    }

    public int setPassword(String pass) {
        if (pass.matches(passREGEX))
        {
            password = pass;
            return pass.length();
        }
        throw new RuntimeException();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
