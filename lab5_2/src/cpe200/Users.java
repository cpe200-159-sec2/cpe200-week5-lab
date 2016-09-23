package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<User> userList;

    public Users(){
        setUserList(new ArrayList<>());
    }

    public void addUser(User user)
    {
        getUserList().add(user);
    }

    public void addUser(String userName, String password)
    {
        User u = new User();
        u.setUserName(userName);
        u.setPassword(password);
        userList.add(u);
    }

    public void deleteUser(User user)
    {
        if(userList.isEmpty()){
            throw new RuntimeException("Error");
        }
        userList.remove(user);
    }

    public boolean exists(User user)
    {
        for(int i = 0 ; i < count();i++){
            if(userList.get(i) == user)
                return true;
        }
        return false;
    }

    public boolean usernameExists(String username)
    {
        for(int i = 0 ; i < count() ; i++){
            if(userList.get(i).getUserName() == username)
                return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for(int i = 0 ; i < count() ; i++){
            if(userList.get(i).getUserName() == userName)
                return userList.get(i);
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
