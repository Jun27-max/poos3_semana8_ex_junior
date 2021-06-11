package poos3_semana8_ex_junior.buscar;

import poos3_semana8_ex_junior.entities.Produto;

public class BuscaFimInicio implements Buscador {


	@Override
	public Produto buscar(Produto[] produtos, int cod) {
		for(int i = produtos.length-1; i >= 0; i--) {
			Produto produto = produtos[i];
			if(produto.getCodigo() == cod) {
				return produto;
			}
		}
		return null;
	}

	
	
		
		
	

}
