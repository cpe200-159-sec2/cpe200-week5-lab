package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName = null;
    public String password = "";
    private static String oldUserName = "";
    private static final String CHECKUSERNAME = "^[A-Za-z][A-Za-z0-9]{7,}$";

    public User() {
    }

    public String setUserName(String name) {
        this.oldUserName = this.userName;
        if(name.matches(CHECKUSERNAME)){
            this.userName = name;
        } else {
            throw new RuntimeException("Incorrect Name");
        }
        return this.oldUserName;
    }

    public int setPassword(String name) {
        if((name.length()>=12)&&(name.matches(".*[a-z]+.*"))&&(name.matches(".*[A-Z]+.*"))&&(name.matches(".*[0-9]+.*"))){
            this.password = name;
        } else {
            throw new RuntimeException("Incorrect Password");
        }
        return password.length();
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
