package com.pieroni.logtrace.observer.core;

import com.pieroni.logtrace.observer.domain.Cobranca;

public class LogTrace {

	private LogTraceEventManager logTraceEvent;
	
	public LogTrace() {
		this.logTraceEvent = new LogTraceEventManager();
		logTraceEvent.subscribe("log", new LogListener());
	}
	
	public void put(String stage, Cobranca object) {
		logTraceEvent.put(stage, object);
	}
	
	public void flush() {
		logTraceEvent.flush();
	}

}
