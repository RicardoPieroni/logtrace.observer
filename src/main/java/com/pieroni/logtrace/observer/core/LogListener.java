package com.pieroni.logtrace.observer.core;


public class LogListener implements LogTraceEventListener{
	
	@Override
	public void update(String LogMessage, Object data) {
		System.out.println("======================================");
		System.out.println(LogMessage);
		System.out.println(data.toString());
	}

	@Override
	public void notify(Object data) {
		// TODO Auto-generated method stub
		System.out.println(data.toString());
	}

}
