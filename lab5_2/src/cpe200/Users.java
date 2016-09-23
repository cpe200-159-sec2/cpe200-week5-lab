package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;
    public Users(){
        userList = new ArrayList<>();
    }

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User user = new User();
        user.setPassword(password);
        user.setUserName(userName);
        userList.add(user);
    }

    public void deleteUser(User user)
    {
        if(!exists(user))throw new RuntimeException("ERROR");
        userList.remove(user);
    }

    public boolean exists(User user)
    {
        return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        for (User findU : userList) {
            if ((findU.getUserName().equals(username))){
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for (User findU : userList){
            if (findU.getUserName().equals(userName)){
                return  findU;
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
        User[] usertoArray = new User[userList.size()];
        usertoArray = userList.toArray(usertoArray);
        return  usertoArray;
    }
}
