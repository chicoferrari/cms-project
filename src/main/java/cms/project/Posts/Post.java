package cms.project.Posts;

import java.util.Set;

import cms.project.Users.*;

import lombok.Data;

@Data
public class Post {
    String id;
    String title;
    String content;
    User author;

    Set<User> mandatoryReviewers;
    Set<Review> reviewers;

}
