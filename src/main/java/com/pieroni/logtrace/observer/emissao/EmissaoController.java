package com.pieroni.logtrace.observer.emissao;

import org.springframework.stereotype.Controller;

import com.pieroni.logtrace.observer.core.LogTrace;
import com.pieroni.logtrace.observer.domain.Cobranca;
import com.pieroni.logtrace.observer.domain.Recebedor;

@Controller
public class EmissaoController {

	public void postCob() {
		final Cobranca cobranca  = new Cobranca();
		
		cobranca.setChave("teste@gmail.com");
		cobranca.setSolicitacaoPagador("Compra Mercado Pieroni");
		
		final LogTrace logTrace = new LogTrace();
		
		logTrace.put("EMISSAO-CTLR-INFO-01", cobranca);
		logTrace.put("CMD-PRCSSR-INFO-01", cobranca);
		
		//simular alteração txid
		cobranca.setTxid("RPC00000000000001");
		logTrace.put("CMD-PRCSSR-INFO-02", cobranca);
		
		//simular manipulação objeto recebedor "VISITOR"
		final Recebedor recebedor = new Recebedor();
		
		recebedor.setNome("Pedro");
		recebedor.setCpf("6546484979");
		logTrace.put("DFNE-RCBDR-VSTR-01", recebedor);
	
		//adicionando object recebedor na cobrança
		cobranca.setRecebedor(recebedor);
		logTrace.put("ADPTR-KAFKA-INF-01", cobranca);
	
				
		logTrace.flush();
	}
}
