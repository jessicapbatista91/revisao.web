package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class HomePage {
	
	Metodos metodo = new Metodos();
    By menuPesquisa = By.id("twotabsearchtextbox");
	
	public void pesquisarProdutoPeloMenu(String produto){
		metodo.escrever(menuPesquisa, produto);
		
		}
}
