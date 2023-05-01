package com.pieroni.logtrace.observer.core;

import com.pieroni.logtrace.observer.domain.Cobranca;

public interface LogTraceEventListener {

	public void update(String LogMessage, Object data);
}
