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
        String regex = "^[A-Za-z][a-zA-Z0-9]{7,}$";
        if (name.matches(regex)) {
            String preName = userName;
            userName = name;
            return preName;
        } else {
            throw new RuntimeException("");
        }
    }

    public int setPassword(String name) {
        String regex = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if (name.matches(regex)) {
            password = name;
            return name.length();
        } else {
            throw new RuntimeException("");
        }
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String secreteGetUserName() {
        return userName;
    }

    public void secretSetUserName(String userName) {
        this.userName = userName;
    }

    public String secertGetPassword() {
        return password;
    }

    public void secretSetPassword(String password) {
        this.password = password;
    }
}
