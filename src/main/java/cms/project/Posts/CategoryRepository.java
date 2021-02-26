package cms.project.Posts;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String> {

    Category findOne(String id);

    List<Category> findAll(String name);

}
