package api.controller;

import api.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

import static api.util.JsonUtil.dataToJson;

public class UserController {

    static final Logger logger = LoggerFactory.getLogger(UserController.class);

    public static String get(Request request, Response response) {
        UserDao dao = new UserDao();
        response.status(200);
        return dataToJson(dao.list());
    }

    /*

    public static String getBy(Request request, Response response) {
    }

    public static String create(Request request, Response response) {
    }

    public static String update(Request request, Response response) {
    }

    public static String delete(Request request, Response response) {
    }
    */
}
