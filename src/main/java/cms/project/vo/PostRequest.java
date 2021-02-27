package cms.project.vo;

import java.util.Set;

import cms.project.base.Category;
import cms.project.base.Tag;

import lombok.Data;

@Data
public class PostRequest {

    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;

}