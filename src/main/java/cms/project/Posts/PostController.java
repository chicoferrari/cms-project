package cms.project.Posts;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findOne(@PathVariable("id") String id) {
        return ResponseEntity.ok(new Post());
    }

    @GetMapping
    public ResponseEntity<List<Post>> findAll() {
        return ResponseEntity.ok(Arrays.asList(new Post(), new Post()));
    }

    @PostMapping
    public ResponseEntity<Post> newPost(PostRequest post){
        return new ResponseEntity<>(new Post(), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removePost(@PathVariable("id") String id){
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable("id") String id, PostRequest post) {
        return new ResponseEntity<>(new Post(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}/review{userId}")
    public ResponseEntity<Review> review(@PathVariable("id") String id, @PathVariable("userId") String userId) {
        return ResponseEntity.ok(new Review());
    }

    @GetMapping(value = "/revised")
    public ResponseEntity<List<Post>> revisedPost() {
        return ResponseEntity.ok(Arrays.asList(new Post(), new Post()));
    }

}