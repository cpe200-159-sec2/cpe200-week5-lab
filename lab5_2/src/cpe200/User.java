package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;
    private String userPattern = "^[a-zA-Z][A-Za-z0-9]{7,}";
    private String passwordPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}";

    public User() {
        setUserName("");
        setPassword("");
    }

    public String setUserName(String name) {
        String oldUserName = null;
        if (!name.equals("") && name != null) {
            if (name.matches(userPattern)) {
                oldUserName = userName;
                userName = name;
            } else
                throw new RuntimeException();
        }
        return oldUserName;
    }

    public int setPassword(String name) {
        if (name != null && !name.equals("")) {
            if (name.matches(passwordPattern)) {
                password = name;
            } else {
                throw new RuntimeException();
            }
        }
        return name.length();
    }

    public String getUserName() {

        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
