package api.dao;

import api.entity.EntityInterface;

import java.util.List;

public interface EntityDaoInterface {

    String getTableName();

    <T extends EntityInterface> T create(T entity);
    <T extends EntityInterface> void delete(T entity);
    <T extends EntityInterface> T update(T entity);

    <T extends  EntityInterface> List<T> list();
    //<T> List<EntityInterface> list(HashMap<String,T> filters);
    <T extends EntityInterface> T getById(int id);




}
