package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logandoSiteFerreto {

	@Test
	public void testeAutomatizado() {
		System.setProperty("webdriver.chrome.driver", "D:\\Games\\IntelliJ\\chromedriver.exe");
		
		WebDriver navegador = new ChromeDriver();
		
		//Acessa o site
		navegador.get("https://www.professorferretto.com.br/");
		
		//entra na página de login
		navegador.get("https://app.professorferretto.com.br/login?_ga=2.224405722.1168651974.1631583265-737650895.1631583265");
		
		//Acrescenta o login e a senha nos campos
		navegador.findElement(By.id("email")).sendKeys("test@hotmail.com");
		navegador.findElement(By.id("password")).sendKeys("test123");
		
		assertEquals(1, 1);
	}
}
