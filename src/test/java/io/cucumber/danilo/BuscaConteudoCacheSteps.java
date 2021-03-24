package io.cucumber.danilo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class BuscaConteudoCacheSteps {
	
	public WebDriver browser;
	
	public BuscaConteudoCacheSteps() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");		
		browser = new ChromeDriver();
	}

	@Dado("que que estou no site do tornese um programador")
	public void que_que_estou_no_site_do_tornese_um_programador() {
	   browser.get("https://www.torneseumprogramador.com.br/");
	}

	@Dado("cliquei no curso de cache")
	public void cliquei_no_curso_de_cache() {
		WebElement input = browser.findElement(By.cssSelector("a[href='/aulas/cache'] img"));
	    input.click();
	}
	
	@Entao("devo clicar no curso de varnish para poder assistir")
	public void cliquei_no_curso_de_varnish_para_poder_assistir() {
		WebElement input = browser.findElement(By.cssSelector(".div-card-aulas:last-child a"));
	    input.click();
	    browser.quit();
	}

}
