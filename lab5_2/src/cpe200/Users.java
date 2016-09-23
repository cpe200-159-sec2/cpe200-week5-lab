package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<User> userList;

    public Users(){
        userList = new ArrayList<User>();
    }
    public void addUser(User user)
    {
        getUserList().add(user);
    }

    public void addUser(String userName, String password)
    {
        User user = new User(userName,password);
        getUserList().add(user);
    }

    public void deleteUser(User user)
    {
        if(!exists(user))throw new RuntimeException("ERROR");
        getUserList().remove(user);
    }

    public boolean exists(User user)
    {
        if(userList.contains(user)){
            return  true;
        }
        return false;
    }

    public boolean usernameExists(String username)
    {
        for(int i=0;i>userList.size();i++){
            if (username.equals(userList.get(i).getUserName())) {
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        String check;
        for(int i=0;i<userList.size();i++){

            check =userList.get(i).getUserName();
            if (check.equals(userName)) {
                return userList.get(i);
            }
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray()
    {
        return userList.toArray(new User[userList.size()]);
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
}
