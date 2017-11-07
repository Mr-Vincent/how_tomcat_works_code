/* explains Tomcat's default container */
package ex04.pyrmont.startup;

import ex04.pyrmont.core.SimpleContainer;
import org.apache.catalina.connector.http.HttpConnector;
import org.apache.logger.Log4jLogger;

public final class Bootstrap {
  public static void main(String[] args) {
    HttpConnector connector = new HttpConnector();
    SimpleContainer container = new SimpleContainer();
    Log4jLogger logger = Log4jLogger.getInstance();
    container.setLogger(logger);
    connector.setContainer(container);
    try {
      connector.initialize();
      connector.start();

      // make the application wait until we press any key.
      System.in.read();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}