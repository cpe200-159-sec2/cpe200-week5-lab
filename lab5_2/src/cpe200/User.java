package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public User(String user, String pass) {
        userName = user;
        password = pass;
    }

    public String setUserName(String name) {
        String regex = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if (name.matches(regex))
        {
            String ret = userName;
            this.userName = name;
            return ret;
        }
        else
        {
            throw new RuntimeException("Invalid username");
        }

    }

    public int setPassword(String name) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]{12,})$";
        if (name.matches(regex))
        {
            int ret = name.length();
            password = name;
            return ret;
        }
        else
        {
            throw new RuntimeException("Invalid Password");
        }

    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {
        return password;
    }
}
