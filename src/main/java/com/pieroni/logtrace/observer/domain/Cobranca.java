package com.pieroni.logtrace.observer.domain;

import java.io.Serializable;

public class Cobranca implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7242391534130864385L;

	private String chave;
	
	private String solicitacaoPagador;
	
	private String txid;
	
	private Recebedor recebedor;

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

	public Recebedor getRecebedor() {
		return recebedor;
	}

	public void setRecebedor(Recebedor recebedor) {
		this.recebedor = recebedor;
	}

	@Override
	public String toString() {
		return "Cobranca [chave=" + chave + ", solicitacaoPagador=" + solicitacaoPagador + ", txid=" + txid
				+ ", recebedor=" + recebedor + "]";
	}

	
	
	
}
