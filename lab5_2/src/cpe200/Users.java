package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;
    public Users(){
        userList = new ArrayList<User>() ;
    }

    public void addUser(User user)
    {
        userList.add(user) ;
    }

    public void addUser(String userName, String password)
    {
        userList.add(new User(userName , password)) ;
    }

    public void deleteUser(User user)
    {
        if(count()==0) throw new RuntimeException("") ;
        userList.remove(user) ;
    }

    public boolean exists(User user)
    {
        if(userList.contains(user)){
            return true ;
        }
        else {
            return false ;
        }
    }

    public boolean usernameExists(String username)
    {
        for(int i=0 ; i<userList.size() ; i++){
            if(userList.get(i).equals(username)){
                return true ;
            }

        }
        throw new RuntimeException("ERROR") ;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for(int i=0 ; i<userList.size() ; i++) {
            if (userList.get(i).getUserName().equals(userName)) {
                return userList.get(i);
            }
        }
        throw new RuntimeException("ERROR") ;
    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray()
    {
        return userList.toArray(new User[userList.size()]) ;
    }
}
