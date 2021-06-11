package poos3_semana8_ex_junior.controlador;

import poos3_semana8_ex_junior.buscar.Buscador;
import poos3_semana8_ex_junior.entities.Produto;

public class GerenciadorProduto {

	private Produto[] produtos;
	private int cont;
	private Buscador busca;

	public GerenciadorProduto(Buscador buscador) {
		produtos = new Produto[10];
		this.busca = buscador;
	}
	
	

	public void addProdutos(Produto produto) {
		Produto p = busca.buscar(aumentaEspaco(), produto.getCodigo());
		if (p != null) {
			System.out.println("Erro: produto encontrado");
		}
		else {
			produtos[cont++] = produto;
			System.out.println("Produto inserido");
			
		}

	}

	public boolean venderProduto(int codigo, int quantidade) {
		Produto p = busca.buscar(aumentaEspaco(), codigo);
		if (p != null) {
			return p.vender(quantidade);
		}

		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < cont; i++) {
			Produto p = produtos[i];
			builder.append("Nome:")
				.append(p.getNome())
				.append(" Estoque:")
				.append(p.getUnidEstoque())
				.append("\n");
		}
		return builder.toString();
	}
	

	private Produto[] aumentaEspaco() {
		Produto[] nuevoArray = new Produto[cont];
		System.arraycopy(produtos, 0, nuevoArray, 0, cont);

		return nuevoArray;

	}

}
