package cms.project.Users;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    User findOne(String id);

    List<User> findAll(String name);

}
