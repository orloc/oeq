package api.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data public class User implements EntityInterface {

    public enum USER_TYPE {
        REGISTERED, ANONYMOUS
    }

    private final int id;

    private String password;
    private String username;
    private String email;
    private List<String> roles;
    private Date last_login;
    private String type;
    private Date created_at;
    private Date updated_at;
    private Date deleted_at;

}
