package Test.log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class CokSukur {

    private  static Logger logger = LogManager.getLogger(CokSukur.class.getName());

    @Test
    public void log4jTest1() {
        logger.info("LOG INFO");
        logger.debug("LOG DEBUG");
        logger.error("LOG ERROR");
        logger.fatal("LOG FATAL");
        logger.warn("LOG WARN");

    }



    }
