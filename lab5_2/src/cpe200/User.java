package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User() {

    }

    public String setUserName(String name) {
        String regex =  "^[A-Za-z][A-Za-z0-9]{7,}$";
        if(name.matches(regex)){
            String ret = userName;
            this.userName = name;
            return ret;
        }
        throw new RuntimeException("Invalid username");
    }

    public int setPassword(String name) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]{12,})$";
        if(name.matches(regex)){
            int ret = name.length();
            this.password = name;
            return ret;
        }
        throw new RuntimeException("Invalid password");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
