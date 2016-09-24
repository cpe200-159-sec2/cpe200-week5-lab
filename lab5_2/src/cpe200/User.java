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
        String OldN;
        String Ncheck = "[A-Za-z][A-Za-z0-9]{7,}";
        if(!name.matches(Ncheck)){
            throw new RuntimeException();
        }
        else{
            OldN = userName;
            userName = name;
            return OldN;
        }
    }

    public int setPassword(String name) {
        String CheckP = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]{12,})";
        if (!name.matches(CheckP)){
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
