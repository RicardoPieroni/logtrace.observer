package com.pieroni.logtrace.observer.core;


public class LogTrace {

	private LogTraceEventManager logTraceEvent;
	
	public LogTrace() {
		this.logTraceEvent = new LogTraceEventManager();
		logTraceEvent.subscribe("log", new LogListener());
	}
	
	public void put(String stage, Object object) {
		logTraceEvent.put(stage, object);
	}
	
	public void flush() {
		logTraceEvent.flush();
	}

}
