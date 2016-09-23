package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<User> userList;

    public void addUser(User user)
    {
    }

    public void addUser(String userName, String password)
    {
    }

    public void deleteUser(User user)
    {

    }

    public boolean exists(User user)
    {
        return false;
    }

    public boolean usernameExists(String username)
    {
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        return null;
    }

    public int count()
    {
        return 0;
    }

    public User[] getUserArray()
    {
        return null;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
}
