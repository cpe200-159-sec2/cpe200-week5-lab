package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName ;
    private String password ;

    public User() {
    }
    public User(String userName , String password) {
        setUserName(userName) ;
        setPassword(password) ;
    }

    public String setUserName(String name) {
        String temp = getUserName() ;
        String check = "^[a-zA-Z][a-zA-Z0-9]{7,}$" ;
        if(name.matches(check)){
            userName=name ;
            return temp ;
        }
        throw new RuntimeException("ERROR") ;

    }

    public int setPassword(String name) {
        String check = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if(name.matches(check)){
            password = name ;
            return  password.length() ;
        }
        throw new RuntimeException("ERROR") ;

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
