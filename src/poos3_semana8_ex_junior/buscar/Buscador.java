package poos3_semana8_ex_junior.buscar;

import poos3_semana8_ex_junior.entities.Produto;

public interface Buscador {
	
	public abstract Produto buscar (Produto[] produtos, int cod);


}
