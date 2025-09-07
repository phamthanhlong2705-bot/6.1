package murach.data;

import murach.business.User;

public class UserDB {
    public static int insert(User user) {
        System.out.println("Saving user: " + user.getEmail());
        return 1; // giả lập thành công
    }
}
