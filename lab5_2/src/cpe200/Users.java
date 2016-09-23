package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;

    public Users()
    {
        userList = new ArrayList<User>();
    }

    public void addUser(User user)
    {
        userList.add(user);
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
        if (!exists(user))
        {
            throw new RuntimeException();
        }
        userList.remove(user);
    }

    public boolean exists(User user)
    {
        for (short i = 0; i < count(); i++)
        {
            if(userList.get(i) == user)
                return true;
        }
        return false;
    }

    public boolean usernameExists(String userName)
    {
        for (short i = 0; i < count(); i++)
        {
            if(userList.get(i).getUserName().equals(userName))
                return true;
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for (short i = 0; i < count(); i++)
        {
            if(userList.get(i).getUserName().equals(userName))
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
        User u[] = new User[count()];
        for (short i = 0; i < count(); i++)
        {
            u[i] = userList.get(i);
        }
        return u;
    }
}
