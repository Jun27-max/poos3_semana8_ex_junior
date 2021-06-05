package poos3_semana8_ex_junior.controlador;

import poos3_semana8_ex_junior.buscar.Buscador;
import poos3_semana8_ex_junior.entities.Produto;

public class GerenciadorProduto {

	private Produto[] produtos;
	private int cont = 0;
	private Buscador busca;

	public GerenciadorProduto(Buscador buscador) {
		produtos = new Produto[10];
		this.busca = buscador;
	}
	
	

	public boolean addProdutos(Produto produto) {
		Produto p = busca.buscar(aumentaEspaco(), produto.getCodigo());
		if (p == null) {
			produtos[cont++] = produto;
			return true;
		}

		return false;

	}

	public boolean venderProduto(Produto produto) {
		Produto p = busca.buscar(aumentaEspaco(), produto.getCodigo());
		if (p == null) {
			produtos[cont--] = produto;
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		if (this.cont == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int i = 0; i < this.cont - 1; i++) {
			builder.append(this.produtos[i]);
			builder.append(",");

		}
		builder.append(this.produtos[this.cont - 1]);
		builder.append("]");

		return builder.toString();
	}

	private Produto[] aumentaEspaco() {
		Produto[] nuevoArray = new Produto[cont * 2];
		System.arraycopy(produtos, 0, nuevoArray, 0, cont);

		return nuevoArray;

	}

}
