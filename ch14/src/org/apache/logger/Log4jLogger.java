package org.apache.logger;

import java.beans.PropertyChangeListener;

import org.apache.catalina.Container;
import org.apache.catalina.Logger;

public class Log4jLogger implements Logger{
	
	public static Log4jLogger getInstance(){
		return new Log4jLogger();
	}
	
	org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Log4jLogger.class);

	public Container getContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setContainer(Container container) {
		// TODO Auto-generated method stub
		
	}

	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getVerbosity() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setVerbosity(int verbosity) {
		// TODO Auto-generated method stub
		
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	public void log(String message) {
		log.debug(message);
	}

	public void log(Exception exception, String msg) {
		// TODO Auto-generated method stub
		
	}

	public void log(String message, Throwable throwable) {
		// TODO Auto-generated method stub
		
	}

	public void log(String message, int verbosity) {
		// TODO Auto-generated method stub
		
	}

	public void log(String message, Throwable throwable, int verbosity) {
		// TODO Auto-generated method stub
		
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	
}
