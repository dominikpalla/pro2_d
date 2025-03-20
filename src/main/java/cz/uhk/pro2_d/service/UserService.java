package cz.uhk.pro2_d.service;

import cz.uhk.pro2_d.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {
    ArrayList<User> getAllUsers();
    void saveUser(User user);
}
