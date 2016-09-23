package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {

    }
    public User(String name,String password) {
        setUserName(name);
        setPassword(password);
    }

    public String setUserName(String name) {
        String temp=userName;
        String regex = "^[a-zA-Z][a-zA-Z0-9]{7,}$";
        if (name.matches(regex)){
            userName = name;
            return temp;
        }else{
            throw new RuntimeException("Invalid name");
        }
    }

    public int setPassword(String name) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
        if (name.matches(regex)){
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
