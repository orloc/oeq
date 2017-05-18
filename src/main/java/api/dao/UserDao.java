package api.dao;


import api.entity.User;

public class UserDao extends AbstractEntityDao {

    public UserDao(){
        super(User.class);
    }

    public String getTableName() {
        return "users";
    }
}
