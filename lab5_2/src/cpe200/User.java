package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;
    private static String oldName;
    private  static  String oldPass;
    public User(){
        userName = null;
        password = null;
    }

    public User(String name ,String pass) {
        setUserName(name);
        setPassword(pass);

    }

    public String setUserName(String name) {
        oldName = userName;
        if ((name.length() >= 8) &&(name.matches("^([A-Za-z])([A-Za-z0-9]+)$"))){
            userName =name;
        }

        else throw new RuntimeException("ERROR");
        return  oldName;


    }

    public int setPassword(String name) {

        if((name.length() >=12)&&(name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]+)$"))){
            password =name;

        }
        else throw  new RuntimeException("ERROR");

        return password.length();
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {

        return password;
    }
}
