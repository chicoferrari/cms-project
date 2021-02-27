package cms.project.Posts;

import java.util.Set;

import cms.project.base.*;

import lombok.Data;

@Data
public class Post {
    String id;
    String title;
    String content;
    User author;

    Set<User> mandatoryReviewers;
    Set<Review> reviewers;

    /* Método que retorna a revisão */
    public Review review(String userId, String status) {
        final Review review = new Review(userId, status);
        this.reviewers.add(review);
        return review;
    }

    /* Vadidador da revisão */
    public Boolean revised() {
        return this.mandatoryReviewers.stream().allMatch(reviewer -> this.reviewers.stream()
            .anyMatch(review -> reviewer.id.equals(review.userId) && "aproved".equals(review.status)));
    }
}
