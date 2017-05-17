package api.controller;

import spark.Request;
import spark.Response;


public class SecurityController {

    public static String login(Request request, Response response) {
        return "login";
    }

    public static String logout(Request request, Response response) {
        return "logoiut";
    }

    public static String register(Request request, Response response) {
        return "reigster";
    }

}
