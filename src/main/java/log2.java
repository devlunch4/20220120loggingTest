import org.apache.log4j.Logger;

public class log2 {

    // log4j의 설정은 log4j.properties / log4j.xml 설정으로 한다.
    // Argument로  출력이 될 객체의 Class(클래스명)를 선택함으로서 로그를 선별적으로 출력할 수 있다.


    // 출력이 될 객체의 클래스를 선택한 logger 객체를 생성하여 각 레벨의 로그를 출력한다.
    // log4j.properties / log4j.xml 으로 설정한대로 로그가 출력되어 나온다.

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(log2.class);
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
    }
}
