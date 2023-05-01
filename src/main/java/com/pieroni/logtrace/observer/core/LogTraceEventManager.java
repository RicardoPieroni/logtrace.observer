package com.pieroni.logtrace.observer.core;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.pieroni.logtrace.observer.domain.Cobranca;

public class LogTraceEventManager {

	private Map<String,LogTraceEventListener> listeners = new HashMap<String, LogTraceEventListener>();
	
	private Map<String,Object> stageEvents = new LinkedHashMap<String, Object>();
	
	public void subscribe(String eventType, LogTraceEventListener listener) {
		listeners.put(eventType, listener);
	}
	
	public void flush() {
		stageEvents.forEach((stageKey,stageValue) ->  
			listeners.forEach((listenerKey, listenerValue) -> listenerValue.update(stageKey, stageValue) ));
	}
	
	public void put(String stage, Object data) {
		stageEvents.put(stage, data);
	}
}
