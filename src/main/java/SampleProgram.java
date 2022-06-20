import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class SampleProgram{

    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(SampleProgram.class);

    public static void solution(){
        String log4jConfigPath = "/home/ubaidullahmohammed/IdeaProjects/SampleLoggerProject/src/main/resources/log4j.properties";
        PropertyConfigurator.configure(log4jConfigPath);
        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");
    }
}