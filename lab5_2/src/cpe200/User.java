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
        String pattern="^([A-Za-z])([A-Za-z0-9]){7,}$";
        String previous;
        if(name.matches(pattern)){
            previous=this.userName;
            userName=name;
            return previous;
        }else{
            throw  new RuntimeException("invalid name");
        }
    }

    public int setPassword(String name) {
        String pattern="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]){12,}$";
        if(name.matches(pattern)){
            password=name;
            return password.length();
        }else{
            throw  new RuntimeException("invalid name");
        }
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {
        return password;
    }
}
