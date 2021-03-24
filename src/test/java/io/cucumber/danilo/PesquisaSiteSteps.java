package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PesquisaSiteSteps {

	public WebDriver browser;
	
	public PesquisaSiteSteps() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");		
		browser = new ChromeDriver();
	}

	@Quando("eu acesso o site do tornese um programador")
	public void eu_acesso_o_site_do_tornese_um_programador() {
	    browser.get("https://www.torneseumprogramador.com.br/");
	}
	
	@Quando("digito no campo busca {string}")
	public void digito_no_campo_busca(String string) {
		WebElement input = browser.findElement( By.cssSelector("input[name='q']") );
	    input.sendKeys(string);
	}
	
	@Quando("clico no botao pesquisar")
	public void clico_no_botao_pesquisar() {
		WebElement input = browser.findElement( By.cssSelector("button[class='btn btn-outline-dark btn-pesquisa']") );
	    input.click();
	}
	
	@Entao("devo acessar a pagina com resultados de busca")
	public void devo_acessar_a_pagina_com_resultados_de_busca() {
		assertEquals(true , browser.findElements( By.cssSelector(".div-card-aulas") ).size() > 0);
		browser.quit();
	}
}
