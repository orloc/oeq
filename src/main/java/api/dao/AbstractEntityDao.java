package api.dao;

import api.entity.EntityInterface;
import org.sql2o.Connection;

import java.util.List;

abstract class AbstractEntityDao<T> extends AbstractDao implements EntityDaoInterface {

    private Class<EntityInterface> classRef;

    AbstractEntityDao(Class<EntityInterface> classRef){
        super();
        this.classRef = classRef;
    }

    @Override
    public List<EntityInterface> list() {
        String query = String.format("select * from %s", this.getTableName());

        try(Connection conn = this.getConnection().open()){
            return conn.createQuery(query)
                    .executeAndFetch(this.classRef);
        }
    }

    @Override
    public EntityInterface getById(int id) {
        return null;
    }

    @Override
    public EntityInterface create(EntityInterface entity) {
        return null;
    }

    @Override
    public EntityInterface update(EntityInterface entity) {
        return null;
    }

    @Override
    public void delete(EntityInterface entity) {

    }
}
