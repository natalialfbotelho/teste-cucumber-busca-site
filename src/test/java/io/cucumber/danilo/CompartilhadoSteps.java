package io.cucumber.danilo;

import io.cucumber.danilo.services.Configuracao;
import io.cucumber.java.pt.Quando;

public class CompartilhadoSteps {
	
	@Quando("eu acesso o site do tornese um programador")
	public void abrindoPagina() {
	   Configuracao.abrirPagina("https://www.torneseumprogramador.com.br/");
	}
	
}
