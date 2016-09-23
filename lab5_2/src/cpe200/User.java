package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;
    protected String USER_NAME_PATTERN = "^([A-Za-z])([A-Za-z0-9]{7,})$";
    protected String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]){12,}$";

    public User() {
    }

    public boolean setUserName(String name) {
        if (name.matches(USER_NAME_PATTERN)) {
            this.userName = name;
            return true;
        } else
            return false;
    }

    public boolean setPassword(String password) {
        if(password.matches(PASSWORD_PATTERN)) {
            this.password = password;
            return true;
        }
        else
            return false;
    }

    public String getUserName() {

        return this.userName;
    }

    public String getPassword() {

        return this.password;
    }
}
