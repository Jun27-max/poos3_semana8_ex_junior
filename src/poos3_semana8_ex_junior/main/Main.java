package poos3_semana8_ex_junior.main;

import poos3_semana8_ex_junior.controlador.GerenciadorProduto;
import poos3_semana8_ex_junior.entities.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto1 = new Produto(1, "Palmolive", 2);
		Produto produto2 = new Produto(1, "Dove", 3);
		Produto produto3 = new Produto(1, "Sebo", 4);
		Produto produto4 = new Produto(1, "Rexona", 5);
		Produto produto5 = new Produto(1, "Pantene", 6);
		
		GerenciadorProduto produto = new GerenciadorProduto(null);
		
		System.out.println(produto.addProdutos(produto1));
		System.out.println(produto.addProdutos(produto2));
		System.out.println(produto.addProdutos(produto3));
		System.out.println(produto.addProdutos(produto4));
		System.out.println(produto.addProdutos(produto5));
	

		produto.venderProduto(produto5);
		
		
		
		
		

	}

}
