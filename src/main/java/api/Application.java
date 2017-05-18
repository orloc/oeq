package api;

import api.util.Config;
import api.util.Route;

import static spark.Spark.*;
import static spark.debug.DebugScreen.*;

public class Application {

    public static void main(String[] args){

        Config.load();

        // spark configuration
        port(Integer.valueOf(Config.getProp("application_port")));

        //enableDebugScreen();

        Route.Api.security();
        Route.Api.user();

        after(Route.Api.prefix+"/*", ((request, response) ->{
            response.type("application/json");
        }));

    }

}
