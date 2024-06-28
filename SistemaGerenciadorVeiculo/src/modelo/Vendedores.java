package modelo;

public class Vendedores {

	
	
	private static int contador = 0;
	private String nome;
	private String cpf;
	private String telefone;
    private double salario;
    private int idVendedor;

    public Vendedores (String nome, String cpf, String telefone, double salario) {
    	this.nome = nome;
    	this.cpf = cpf;
    	this.telefone = telefone;
    	this.idVendedor = ++contador;
    }
    
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Vendedores.contador = contador;
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

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}

