package pisith.xyz.blogapp.users;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public List<User> getList() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
//        user.setStatus(User.UserStatus.valueOf(user.getStatus().toString()));
        User savedUser = userRepository.save(user);
        log.info("User with id {} saved successfully", user.getId());
        return savedUser;
    }
}
