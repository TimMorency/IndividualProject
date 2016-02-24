package persistence;

import org.apache.log4j.Logger;

/**
 * Created by Student on 2/17/2016.
 */
public class LogExample {

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    public LogExample() {

        log.info("Logged Message info");
        log.trace("trace");
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        log.fatal("fatal");
    }
}
