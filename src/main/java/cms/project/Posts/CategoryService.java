package cms.project.Posts;

import java.util.List;

public interface CategoryService {

    Category update(Category category);

    Category create(Category category);

    void delete(String id);

    List<Category> findAll();

}