package ex11.pyrmont.core;

import org.apache.catalina.Context;
import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;

public class SimpleContextConfig implements LifecycleListener {

  public void lifecycleEvent(LifecycleEvent event) {
    if (Lifecycle.START_EVENT.equals(event.getType())) {
    	System.out.println("==============START_EVENT=================");
      Context context = (Context) event.getLifecycle();
      context.setConfigured(true);
    }else if (Lifecycle.BEFORE_START_EVENT.equals(event.getType())) {
    	System.out.println("==============BEFORE_START_EVENT=================");
    } else if(Lifecycle.BEFORE_STOP_EVENT.equals(event.getType())) {
    	System.out.println("==============BEFORE_STOP_EVENT==================");
    }else if(Lifecycle.STOP_EVENT.equals(event.getType())) {
    	System.out.println("==============STOP_EVENT==================");
    }
  }
}