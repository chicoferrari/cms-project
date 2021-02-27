package cms.project.data;

import cms.project.base.Category;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {

    //List<Category> findAll(String name);

    List<Category> findByNameIgnoreCaseStartingWith(String name);

	//Category findOne(String id);

	List<Category> findByName(String name);

}
