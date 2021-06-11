package poos3_semana8_ex_junior.main;

import poos3_semana8_ex_junior.buscar.BuscaInicioFim;
import poos3_semana8_ex_junior.buscar.Buscador;
import poos3_semana8_ex_junior.controlador.GerenciadorProduto;
import poos3_semana8_ex_junior.entities.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buscador b = new BuscaInicioFim();
		
		GerenciadorProduto produto = new GerenciadorProduto(b);
		
		
		produto.addProdutos(new Produto(1, "Palmolive", 10));
		produto.addProdutos(new Produto(2, "Dove", 3));
		produto.addProdutos(new Produto(3, "Sebo", 4));
		produto.addProdutos(new Produto(4, "Rexona", 5));
		produto.addProdutos(new Produto(5, "Pantene", 6));
	

		System.out.println(produto.venderProduto(1, 5)); //true
		System.out.println(produto.venderProduto(1, 5)); //true
		System.out.println(produto.venderProduto(1, 1)); //false
		System.out.println(produto.venderProduto(5, 1)); //false
		System.out.println(produto.venderProduto(2, 4)); //true
		
		System.out.println(produto);
		
		
		
		
		

	}

}
