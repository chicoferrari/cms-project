package cms.project.Users;

import javax.management.relation.Role;

import lombok.Data;

@Data
public class User {
    public String id;
    String identity;
    String name;
    Role role;
}
