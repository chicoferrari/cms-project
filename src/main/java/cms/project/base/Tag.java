package cms.project.base;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Tag {

    String value;

}
