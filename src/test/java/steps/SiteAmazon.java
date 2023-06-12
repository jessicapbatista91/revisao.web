package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import metodos.Metodos;
import pages.HomePage;
import runner.Navegadores;

public class SiteAmazon extends Navegadores{
	
Metodos metodo = new Metodos();
Navegadores nav = new Navegadores();
HomePage home = new HomePage();

@Before
public void iniciarTeste() {
	nav.abrirNavegador();
	
}
	
	@Test
	public void validarTitulo() {
		metodo.validarTitle("Amazon.com.br | Tudo pra você, de A a Z.");
	}	
	
	@Test
	public void pesquisarProdutoTeste(){
	    home.pesquisarProdutoPeloMenu("Iphone 14 Pro Max");	
	}
	@After
	public void finalizarTeste() {
		//nav.fecharNavegador();
	}
}
