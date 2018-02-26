package com.lessons;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Properties;

public class Migrate {

    private static final Logger logger = LoggerFactory.getLogger(Migrate.class);


    /***************************************************************************************
     * main()
     * @return nothing
     * @throws Exception
     *
     * Running this class causes flyway:migrate to run
     * NOTE:  The jdbc information is taken from the migration.properties file
     ***************************************************************************************/
    public static void main(String[] args) throws Exception {
        logger.debug("main() started.");

        // Get the properties from the file
        Properties appProps = getPropertiesFromInsideTheJar();

        Flyway flyway = new Flyway();

        flyway.setDataSource(appProps.getProperty("jdbc.url"),
                appProps.getProperty("jdbc.username"),
                appProps.getProperty("jdbc.password"));

        flyway.migrate();

        logger.debug("main() finished.");
    }


    /***************************************************************************************
     * getPropertiesFromInsideTheJar()
     * @return Properties object
     * @throws Exception
     *
     * Get the properties from the property file found in /src/main/resources/migration.properties
     * NOTE:  because this file is in src/main/resources, it will be inserted into the Java JAR
     ***************************************************************************************/
    private static Properties getPropertiesFromInsideTheJar() throws Exception {
        // Get the path of the default.properties  (should be located in /src/main/resources)
        InputStream is = Migrate.class.getResourceAsStream("/migration.properties");
        Properties props = new Properties();
        props.load(is);
        return props;
    }
}
