package poos3_semana8_ex_junior.buscar;

import poos3_semana8_ex_junior.entities.Produto;

public class BuscaInicioFim implements Buscador {

	@Override
	public Produto buscar(Produto[] produtos, int cod) {
		for(Produto prod: produtos) { 
			if (prod.getCodigo() == cod) {
				return prod;
			}
		}
		
		return null;
	}

}
