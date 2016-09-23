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
            String check = "^[A-Za-z][A-Za-z0-9]{7,}$";
            if (name.matches(check)) {
                String tmp = userName;
                userName = name;
                return tmp;
            } else {
                throw new RuntimeException("Invalid name");
            }
        }

        public int setPassword(String name) {
            String check = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}$";
            if (name.matches(check)) {
                password = name;
                return password.length();
            } else {
                throw new RuntimeException("Invalid password");
            }
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }
    }

