package modelo;
//Cada tipo de veículo deve conter, pelo menos, atributos como **categoria** e **descrição.**


//Classe TipoVeiculos
    public class TiposDeVeiculos {
	private String categoria;
	private String descricao;

	// Construtor
	public TiposDeVeiculos(String categoria, String descricao) {
		this.categoria = categoria;
		this.descricao = descricao;
	}

	// Getters e Setters
	public String getCategoria () {
		return categoria;
	}
	public void setCategoria (String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao () {
		return descricao;
	}
	public void setDescricao ( String descricao) {
		this.descricao = descricao;
	}
}
