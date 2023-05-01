package com.pieroni.logtrace.observer.core;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.pieroni.logtrace.observer.util.DeepCloneUtil;

public class LogTraceEventManager {
	
	private DeepCloneUtil deepCloneUtil;

	private Map<String,LogTraceEventListener> listeners = new HashMap<String, LogTraceEventListener>();
	
	private Map<String,Object> stageEvents = new LinkedHashMap<String, Object>();
	
	public LogTraceEventManager() {
		deepCloneUtil = new DeepCloneUtil();
	}
	
	public void subscribe(String eventType, LogTraceEventListener listener) {
		listeners.put(eventType, listener);
	}
	
	public void flush() {
		listeners.forEach((listenerKey, listenerValue) -> listenerValue.notify(stageEvents.values()));
	}
	
	public void put(String stage, Object data) {
		stageEvents.put(stage, deepCloneUtil.clone(data));
	}
	
	
}
