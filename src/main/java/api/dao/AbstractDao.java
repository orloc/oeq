package api.dao;

import api.util.Config;
import org.sql2o.Sql2o;

abstract class AbstractDao {

    private static Sql2o sql20 = null;

    AbstractDao(){
        if (AbstractDao.sql20 != null) {
           return;
        }

        String dbUri = String.format("%s:%s/%s?%s",Config.getProp("db_host"),
                Config.getProp("db_port"),
                Config.getProp("db_database"),
                "serverTimezone=UTC"

        );

        AbstractDao.sql20 = new Sql2o("jdbc:mysql://" + dbUri,
                Config.getProp("db_user"),
                Config.getProp("db_pass")
        );
    }

    Sql2o getConnection(){
        return AbstractDao.sql20;
    }
}
