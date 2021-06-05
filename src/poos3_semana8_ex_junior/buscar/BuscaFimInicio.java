package poos3_semana8_ex_junior.buscar;

import poos3_semana8_ex_junior.entities.Produto;

public class BuscaFimInicio implements Buscador {

	@Override
	public Produto buscar(Produto[] produtos, int cod) {
		for (int i = produtos.length - 1; i >= 0; i--) {
			Produto prod = produtos[i];
			if (prod.getCodigo() == cod) {
				return prod;
			}
		}
		return null;
		
	}

	
	
		
		
	

}
