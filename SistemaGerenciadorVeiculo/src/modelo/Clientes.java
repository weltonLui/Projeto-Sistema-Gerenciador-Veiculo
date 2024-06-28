package modelo;
//Cada cliente deve conter, pelo menos, atributos como **nome**, **CPF** e **telefone**.
public class Clientes {

	
	
	private static int contador = 0;
	
	private double renda;
	private int idCliente;
	private String nome;
	private String cpf;
	private String telefone;
	
	public Clientes (String nome, String cpf, String telefone, double renda) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.renda = renda;
		this.idCliente = ++contador;
	}
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Clientes.contador = contador;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	
}