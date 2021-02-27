package cms.project.service;

import cms.project.base.User;
import cms.project.vo.UserRequest;

public interface UserService {

    User update(String id, UserRequest userRequest);

    User create(UserRequest userRequest);

    void delete(String id);

    Iterable<User> findAll();

}