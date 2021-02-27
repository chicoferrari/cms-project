package cms.project.service;

import cms.project.base.Category;

import java.util.List;

public interface CategoryService  {

    Category update(Category category);

    Category create(Category category);

    void delete(String id);

    Category findOne(String id);

	List<Category> findByName(String name);
}
