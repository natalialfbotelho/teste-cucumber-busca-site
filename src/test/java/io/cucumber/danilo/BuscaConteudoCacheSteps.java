package io.cucumber.danilo;

import io.cucumber.danilo.services.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class BuscaConteudoCacheSteps {
	
	
	@Dado("cliquei no curso de cache")
	public void clicandoNoCursoDeCache() {
		Configuracao.cssSelector("a[href='/aulas/cache'] img").click();	    
	}
	
	@Entao("devo clicar no curso de varnish para poder assistir")
	public void clicandoNoCursoDeVarnish() {
		Configuracao.cssSelector(".div-card-aulas:last-child a").click();	    
	    Configuracao.fecharPagina();
	}

}
