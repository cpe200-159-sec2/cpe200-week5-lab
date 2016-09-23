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
        String OldName;
        String Ncheck = "[A-Za-z][A-Za-z0-9]{7,}";
        if(!name.matches(Ncheck)){
            throw new RuntimeException();
        }
        else{
            OldName = userName;
            userName = name;
            return OldName;
        }
    }

    public int setPassword(String name) {
        String PCheck = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]{12,})";
        if (!name.matches(PCheck)){
            throw new RuntimeException();
        }
        else
            password = name;
            return password.length();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
