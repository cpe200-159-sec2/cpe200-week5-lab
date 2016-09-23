package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;

    public Users() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void addUser(String userName, String password) {
        User user = new User();
        user.setPassword(userName);
        user.setUserName(password);
        userList.add(user);
    }

    public void deleteUser(User user) {
        if (userList.isEmpty()) throw new RuntimeException("");
        userList.remove(user);

    }

    public boolean exists(User user) {
        if (userList.contains(user)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean usernameExists(String username) {
        for (User findUser : userList) {
            if (findUser.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName) {

        for (User find : userList) {
            if (find.getUserName().equals(userName)) {
                return find;
            }
        }
        return null;
    }

    public int count() {
        return userList.size();
    }

    public User[] getUserArray() {
        User[] userArrey = new User[count()];
        userArrey = userList.toArray(userArrey);
        return userArrey;
    }
}
