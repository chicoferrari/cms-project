package cms.project.vo;

import lombok.Data;

import cms.project.base.Role;

@Data
public class UserRequest {
    String identity;
    String name;

    Role role;
}