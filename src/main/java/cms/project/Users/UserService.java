package cms.project.Users;

import java.util.List;

public interface UserService {

    User update(String id, UserRequest userRequest);

    User create(UserRequest userRequest);

    void delete(String id);

    List<User> findAll();

}