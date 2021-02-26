package cms.project.Posts;

import java.util.Set;

import lombok.Data;

@Data
public class PostRequest {
    String title;
    String content;

    Set<Category> categories;
    Set<Tag> tags;
}