package api.util;

import api.controller.*;
import static spark.Spark.*;


public class Route {

    public static class Api {

        public static String prefix = "/api/v1";

        public static void security(){
            post("/login", SecurityController::login);
            post("/logout", SecurityController::logout);
            post("/register", SecurityController::register);
        }

        public static void user(){
            get(prefix + "/user", UserController::get);
            /*
            get(prefix + "/user/:id", UserController::getBy);
            post(prefix + "/user", UserController::create);
            patch(prefix + "/user/:id", UserController::update);
            delete(prefix + "/user/:id", UserController::delete);
            */
        }

    }
}
