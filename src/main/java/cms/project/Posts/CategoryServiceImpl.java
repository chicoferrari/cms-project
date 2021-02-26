package cms.project.Posts;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public Category update(Category category) {
        return this.categoryRepository.save(category);
    }

    public Category create(Category category) {
        return this.categoryRepository.save(category);
    }

    public void delete(String id) {
        final Category category = this.categoryRepository.findOne(id);
        this.categoryRepository.delete(category);
    }

    public List<Category> findAll() {
        return (List<Category>) this.categoryRepository.findAll();
    }

    public Category findOne(String id) {
        return this.categoryRepository.findOne(id);
    }

}