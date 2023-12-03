package task2;

import task2.User;
import task2.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserUsernameById(int userId) {
        User user = userRepository.getUserById(userId);
        return user.getUsername();
    }
}
