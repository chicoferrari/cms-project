package cms.project.exceptions;

import lombok.Getter;

public class PostNotFoundException extends RuntimeException {

    @Getter
    private final String id;

    public PostNotFoundException(String id) {
        this.id = id;
    }

}