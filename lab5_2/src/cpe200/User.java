package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;
    private String user = new String("^[A-Za-z][a-zA-Z0-9]{7,}$");
    private String pass = new String("^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{12,}$");

    public User() {
    }

    public boolean setUserName(String name) {
        userName = name;

        if(name.matches(user)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean setPassword(String name) {
        password = name;

        if(name.matches(pass)) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}