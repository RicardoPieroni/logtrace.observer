package com.pieroni.logtrace.observer.domain;

import java.io.Serializable;

public class Recebedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3660520547855689246L;

	private String nome;
	
	private String cpf;
	
	private String cnpj;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Recebedor [nome=" + nome + ", cpf=" + cpf + ", cnpj=" + cnpj + "]";
	}
	
	
}
