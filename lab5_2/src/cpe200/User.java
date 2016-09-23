package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }
    public User(String user,String pass){
        setUserName(user);
        setPassword(pass);
    }
    public String setUserName(String name)
    {
        String preUsername = getUserName();
        if(name.matches("^([A-Za-z])([A-Za-z0-9]{7,})$")){
            this.userName = name;
            return preUsername;
        }
        throw new RuntimeException("ERROR");
    }

    public int setPassword(String name)
    {
        if(name.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([A-Za-z0-9]){12,}$")){
            this.password = name;
            return this.password.length();
        }
        throw new RuntimeException("ERROR");
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
