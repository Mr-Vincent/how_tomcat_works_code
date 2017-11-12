package ex06.pyrmont.core;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.Logger;
import org.apache.logger.Log4jLogger;
/**
 * 为connector添加的linstener
 * @author dongwei
 *
 */
public class SimpleConnectorLifecycleListener implements LifecycleListener {
	Logger log = Log4jLogger.getInstance();

  public void lifecycleEvent(LifecycleEvent event) {
    Lifecycle lifecycle = event.getLifecycle();
    log.log("===========SimpleConnectorLifecycleListener event " +
      event.getType().toString()+"=============");
    if (Lifecycle.START_EVENT.equals(event.getType())) {
    	log.log("------>Starting connector<---------");
    }
    else if (Lifecycle.STOP_EVENT.equals(event.getType())) {
    	log.log("------>Stopping connector<--------");
    }
  }
}