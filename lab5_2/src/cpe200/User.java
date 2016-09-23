package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public String setUserName(String name) {
        String PreUsername = getUserName();
        String regax = "^[a-zA-Z][a-zA-Z0-9]{7,}$";
        if(name.matches(regax)){
            userName = name ;
            return PreUsername;
        }
        throw new RuntimeException("Error");
    }

    public int setPassword(String name) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
        if(name.matches((regex))){
            password = name ;
            return password.length();
        }
        throw new RuntimeException("Error");
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {
        return password;
    }
}
