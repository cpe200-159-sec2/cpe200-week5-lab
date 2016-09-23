package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public String setUserName(String name) {
        String oldname;
        String checkName = "^[A-Za-z][a-zA-Z0-9]{7,}$";
        if(!name.matches(checkName)){
            throw new RuntimeException("invalid name.");
        }else
            oldname = userName;
            userName = name ;
            return oldname;
    }

    public int setPassword(String name) {
        String checkpw = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if(name.matches(checkpw)) {
            password = name;
            return password.length();
        }else throw new RuntimeException("invalid name.");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
