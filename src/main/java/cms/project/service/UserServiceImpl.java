package cms.project.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import cms.project.base.User;
import cms.project.data.UserRepository;
import cms.project.exceptions.UserNotFoundException;
import cms.project.vo.UserRequest;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public User update(String id, UserRequest userRequest) {
        final Optional<User> user = this.userRepository.findById(id);
        if (user.isPresent()) {
            final User userDB = user.get();
            userDB.setIdentity(userRequest.getIdentity());
            userDB.setName(userRequest.getName());
            userDB.setRole(userRequest.getRole());
            return this.userRepository.save(userDB);
        }else {
            throw new UserNotFoundException(id);
        }
    }

    public User create (UserRequest userRequest) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setIdentity(userRequest.getIdentity());
        user.setName(userRequest.getName());
        user.setRole(userRequest.getRole());
        return this.userRepository.save(user);
    }

    public void delete(String id) {
        final Optional<User> user = this.userRepository.findById(id);
        user.ifPresent(this.userRepository::delete);
    }

    public Iterable<User> findAll() {
        return this.userRepository.findAll();
    }

    public User findOne(String id) {
        final Optional<User> user = this.userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }else {
            throw new UserNotFoundException(id);
        }
    }

}