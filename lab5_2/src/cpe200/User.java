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
        if (name.matches("^[A-Za-z][A-Za-z0-9]{7,}$")){
            String tmp = userName;
            userName = name;
            return tmp;
        }else{
            throw new RuntimeException("Invalid name");
        }
    }

    public int setPassword(String name) {
        if (name.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{12,}$")) {
            password = name;
            return password.length();
        }else{
            throw new RuntimeException("Invalid password");
        }
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {

        return password;
    }
}
