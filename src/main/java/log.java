import java.util.logging.Level;
import java.util.logging.Logger;

public class log {
    private final static Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {
        LOG.setLevel(Level.INFO);
/*
        LOG.TRACE("TRACE Log");
        LOG.DEBUG("DEBUG Log");
        LOG.INFO("INFO Log");
        LOG.WARN("WARN Log");
        LOG.ERROR("ERROR Log");
        LOG.FATAL("FATAL Log");
*/
        LOG.severe("severe Log");
        LOG.warning("warning Log");
        LOG.info("info Log");
    }
}