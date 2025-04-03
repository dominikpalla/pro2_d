package cz.uhk.pro2_d.service;

import cz.uhk.pro2_d.model.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    User getUser(long id);
    void deleteUser(long id);
}
