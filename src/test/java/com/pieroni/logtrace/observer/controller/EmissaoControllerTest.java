package com.pieroni.logtrace.observer.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.pieroni.logtrace.observer.emissao.EmissaoController;



public class EmissaoControllerTest {

	private EmissaoController emissaoController;
	
	@Test
	public void postTest() {
		emissaoController = new EmissaoController();
		emissaoController.postCob();
	}
}
