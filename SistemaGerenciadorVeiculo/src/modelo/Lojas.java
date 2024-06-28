package modelo;
//Cada loja deve conter pelo menos os atributos como **`nome`**, **`endereço`** e **`telefone`** 


//Classe Loja
    public class Lojas {
    	private static int contador = 0;
	private String nome;
	private String endereco;
	private String telefone;
	private int idLojas;
	// Construtor

	public Lojas(String nome, String endereco, String telefone) {
	this.nome = nome;
	this.endereco = endereco;
	this.telefone = telefone;
	this.idLojas = ++contador;
}

   // Getters e Setters
    public String getEndereco () {
	return endereco;
}
    
    public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Lojas.contador = contador;
	}

	public int getIdLojas() {
		return idLojas;
	}

	public void setIdLojas(int idLojas) {
		this.idLojas = idLojas;
	}

	public void setEndereco (String endereco) {
	this.endereco = endereco;
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
    
}











