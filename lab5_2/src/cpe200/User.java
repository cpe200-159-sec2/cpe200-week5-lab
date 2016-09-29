package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;
    private static String OldNmae;
    private static String OldPassword;

    public User() {
        userName = null;
        password = null;
    }

    public User(String name ,String pass){
        setUserName(name);
        setPassword(pass);
    }
    public String setUserName(String name) {
        OldNmae = userName;

        if (name.matches("^([A-Z|a-z])([A-Z|a-z|0-9]+)$")&&name.length()>=8){
            userName = name;

        }
        else throw new RuntimeException("error");
        return  OldNmae;
    }

    public int setPassword(String name) {

        if (name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([A-Z|a-z|0-9])+$")&&name.length()>=8){
            password = name;

        }
        else throw new RuntimeException("error");
        return password.length();
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {
        return password;
    }
}
