package com.pieroni.logtrace.observer.core;


public class LogListener implements LogTraceEventListener{
	

	@Override
	public void notify(Object data) {
		System.out.println("======================================");
		System.out.println(data.toString());
	}

}
