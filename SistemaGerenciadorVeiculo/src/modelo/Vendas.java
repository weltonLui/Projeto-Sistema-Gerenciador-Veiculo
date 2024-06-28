package modelo;
//Cada venda deve conter, no mínimo, atributos como **veículo vendido**, 
//**vendedor responsável**, **cliente comprador**, **data da venda**.

	//Classe Venda
	 public class Vendas {
		 private static int contador = 0;
		 
	 private Veiculos veiculoVendido;
	 private Vendedores vendedorResponsavel;
	 private Clientes clienteComprador;
	 private String dataVenda;
	 private int idVenda;

	 // Construtor
	 public Vendas(Veiculos veiculoVendido, Vendedores vendedorResponsavel, Clientes clienteComprador, String dataVenda) {
	 this.veiculoVendido = veiculoVendido;
	 this.vendedorResponsavel = vendedorResponsavel;
	 this.clienteComprador = clienteComprador;
	 this.dataVenda = dataVenda;
	 this.idVenda = ++contador;
	 }
	 
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Vendas.contador = contador;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public Veiculos getVeiculoVendido() {
		return veiculoVendido;
	}

	public void setVeiculoVendido(Veiculos veiculoVendido) {
		this.veiculoVendido = veiculoVendido;
	}

	public Vendedores getVendedorResponsavel() {
		return vendedorResponsavel;
	}

	public void setVendedorResponsavel(Vendedores vendedorResponsavel) {
		this.vendedorResponsavel = vendedorResponsavel;
	}

	public Clientes getClienteComprador() {
		return clienteComprador;
	}

	public void setClienteComprador(Clientes clienteComprador) {
		this.clienteComprador = clienteComprador;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getData() {
		// TODO Auto-generated method stub
		return null;
	}

	 
	 
	}

