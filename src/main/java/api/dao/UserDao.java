package api.dao;

import api.entity.EntityInterface;
import api.entity.User;
import org.sql2o.Connection;

import java.util.List;

/**
 * Created by orloc on 5/17/17.
 */
public class UserDao extends AbstractDao implements EntityDaoInterface {

    @Override
    @SuppressWarnings("unchecked")
    public List<User> list() {
        String query ="select * from users";

        try(Connection conn = AbstractDao.sql20.open()){
            return conn.createQuery(query)
                .executeAndFetch(User.class);
        }
    }

    @Override
    public <T extends EntityInterface> T getById(int id) {
        return null;
    }

    @Override
    public <T extends EntityInterface> T create(T entity) {
        return null;
    }

    @Override
    public <T extends EntityInterface> T update(T entity) {
        return null;
    }

    @Override
    public <T extends EntityInterface> void delete(T entity) {

    }

    @Override
    public String getTableName() {
        return "users";
    }
}
