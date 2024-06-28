package modelo;
//Cada veículo deve conter pelo menos os atributos **marca**, **modelo**, **ano**, **placa** e **preço**


	//Classe Veiculo
     public class Veiculos {
    	 private static int contador = 0;
    	 
	 private String marca;
	 private String modelo;
	 private int ano;
	 private String placa;
	 private double preco;
	 private TiposDeVeiculos tipoDeVeiculo; //falta colocar o s no final da palavra tipoDeVeiculos.
	 public int idVeiculo;
	
	 // Construtor
	 public Veiculos(String marca, String modelo, int ano, String placa, double preco, TiposDeVeiculos tipoDeVeiculo) {
	     this.marca = marca;
	     this.modelo = modelo;
	     this.ano = ano;
	     this.placa = placa;
	     this.preco = preco;
	     this.tipoDeVeiculo = tipoDeVeiculo;
	     this.idVeiculo = ++contador; //identificar o veiculo, cada carro castrado vai ser um numero
	 
	 }

	 
	 // Getters e Setters (métodos para acessar e modificar os atributos)
	 
	 public String getMarca () {
		 return marca;
	 }
	 public int getIdVeiculo() {
		return idVeiculo;
	}

	public TiposDeVeiculos getTipoDeVeiculos() {
		return tipoDeVeiculo;
	}

	public void setTipoDeVeiculos(TiposDeVeiculos tipoDeVeiculos) {
		this.tipoDeVeiculo = tipoDeVeiculos;
	}

	public void setMarca (String marca) {
		 this.marca = marca;
	 }
	 public String getModelo () {
		 return modelo;
	 }
	 public void setModelo (String modelo) {
		 this.modelo = modelo;
	 }
	 public int getAno () {
		 return ano;
	 }
	 public void setAno (int ano) {
		 this.ano = ano;
	 }
	 public String getPlaca() {
		 return placa;
	 }
	 
	 public void setPlaca (String placa) {
		 this.placa = placa;
	 }
	 public double getPreco () {
		 return preco;
	 }
	 public void setPreco (double preco) {
		 this.preco = preco;
	 }
	 public void setIdVeiculos(int idVeiculo) {
		 this.idVeiculo = idVeiculo;
	 }


	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Veiculos.contador = contador;
	} 
}


