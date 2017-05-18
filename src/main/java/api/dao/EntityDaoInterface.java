package api.dao;

import api.entity.EntityInterface;

import java.util.List;

public interface EntityDaoInterface {

    String getTableName();
    EntityInterface create(EntityInterface entity);
    void delete(EntityInterface entity);
    EntityInterface update(EntityInterface entity);

    List<EntityInterface> list();
    EntityInterface getById(int id);

}
