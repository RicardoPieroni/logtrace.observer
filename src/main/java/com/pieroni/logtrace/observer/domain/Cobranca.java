package com.pieroni.logtrace.observer.domain;

public class Cobranca {

	private String chave;
	
	private String solicitacaoPagador;
	
	private String txid;

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getSolicitacaoPagador() {
		return solicitacaoPagador;
	}

	public String getTxid() {
		return txid;
	}

	public void setTxid(String txid) {
		this.txid = txid;
	}

	public void setSolicitacaoPagador(String solicitacaoPagador) {
		this.solicitacaoPagador = solicitacaoPagador;
	}

	@Override
	public String toString() {
		return "Cobranca [chave=" + chave + ", solicitacaoPagador=" + solicitacaoPagador + ", txid=" + txid + "]";
	}

	
	
	
}
