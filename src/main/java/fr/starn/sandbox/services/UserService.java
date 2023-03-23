package fr.starn.sandbox.services;

import fr.starn.sandbox.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 3/23/2023.
 */
@Service
public class UserService {
    public List<User> getUsers() {
        User u1 = new User("0", "user1", "user1@gmail.com", 40);
        User u2 = new User("1", "user2", "user2@gmail.com", 38);
        User u3 = new User("2", "user3", "user3@gmail.com", 67);
        User u4 = new User("3", "user4", "user4@gmail.com", 66);
        List<User> users = new ArrayList<>();

        users.add(u1);
        users.add(u4);
        users.add(u3);
        users.add(u2);
        return users;
    }
}
