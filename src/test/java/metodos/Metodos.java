package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory{
	
		
	public void validarTitle(String tituloEsperado) {
		 String tituloCapturado = driver.getTitle();
		 assertEquals(tituloEsperado, tituloCapturado);
	}

	public void escrever(By elemento, String texto) {
          driver.findElement(elemento).sendKeys(texto);	
	}
	
	
	

}
