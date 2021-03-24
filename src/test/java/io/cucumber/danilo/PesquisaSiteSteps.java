package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import io.cucumber.danilo.services.Configuracao;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PesquisaSiteSteps {
	
	@Quando("digito no campo busca {string}")
	public void buscaPorTexto(String string) {
		Configuracao.cssSelector("input[name='q']").sendKeys(string);
	}
	
	@Quando("clico no botao pesquisar")
	public void clicandoNoBotaoDePesquisa() {
		Configuracao.cssSelector("button[class='btn btn-outline-dark btn-pesquisa']").click();
	}
	
	@Entao("devo acessar a pagina com resultados de busca")
	public void validandoResultado() {
		assertEquals(true , Configuracao.cssSelectors(".div-card-aulas").size() > 0);
		Configuracao.fecharPagina();
	}
}
