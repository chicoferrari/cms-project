package cms.project.data;

import org.springframework.data.jpa.repository.JpaRepository;

import cms.project.base.Post;

public interface PostRepository extends JpaRepository<Post, String> {

}