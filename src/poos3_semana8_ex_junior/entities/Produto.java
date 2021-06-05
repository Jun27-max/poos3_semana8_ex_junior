package poos3_semana8_ex_junior.entities;


public class Produto {

	private Integer codigo;
	private String nome;
	private Integer unidEstoque;

	public Produto(Integer codigo, String nome, Integer unidEstoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.unidEstoque = unidEstoque;
	}

	public Produto() {

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getUnidEstoque() {
		return unidEstoque;
	}

	public void setUnidEstoque(Integer unidEstoque) {
		this.unidEstoque = unidEstoque;
	}
	
	
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", unidEstoque=" + unidEstoque + "]";
	}
	
	
	
	

}
