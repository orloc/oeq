package api.util;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private static final Logger logger = LoggerFactory.getLogger(Config.class);

    @Getter private static Properties properties = null;

    public static String getProp(String name){
        Object prop = Config.properties.get(name);
        return prop.toString();
    }

    public static void load(){

        logger.info("Loading configuration file...");
        if (Config.properties != null) return;

        Properties prop = new Properties();
        InputStream input = null;

        try {
            String filename = "config.properties";
            input = Config.class.getClassLoader().getResourceAsStream(filename);
            if (input == null){
                logger.error("Null configuration");
                throw new IOException("Null configuration");
            }

            prop.load(input);

            Config.properties = prop;
            logger.info("Configuration loaded!");

        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
            if (input != null){
                try {
                    input.close();
                } catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
