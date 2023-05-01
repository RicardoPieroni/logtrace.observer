package com.pieroni.logtrace.observer.emissao;

import org.springframework.stereotype.Controller;

import com.pieroni.logtrace.observer.core.LogTrace;
import com.pieroni.logtrace.observer.domain.Cobranca;

@Controller
public class EmissaoController {

	public void postCob() {
		final Cobranca cobranca  = new Cobranca();
		
		cobranca.setChave("teste@gmail.com");
		cobranca.setSolicitacaoPagador("Compra Mercado Pieroni");
		
		final LogTrace logTrace = new LogTrace();
		
		logTrace.put("EmissaoController", cobranca);
		logTrace.put("Commandprocessor", cobranca);
		
		//simular alteração objeto
		cobranca.setTxid("RPC00000000000001");
		logTrace.put("Commandprocessor info 2", cobranca);
	
		logTrace.put("Kafka publisher", cobranca);
	
				
		logTrace.flush();
	}
}
