package manutencao_cadastro;

import java.util.ArrayList;
import java.util.List;

import modelo.Veiculos;


public class GerenciarVeiculo implements Gerenciadora <Veiculos> {
	private static GerenciarVeiculo instance;
	private List <Veiculos> veiculos;

	private GerenciarVeiculo() {
		veiculos = new ArrayList <> ();
	}
	public static synchronized GerenciarVeiculo getInstance() {
		if (instance == null) {
			instance = new GerenciarVeiculo();
		}
		return instance;
	}
	
	
	@Override
	public void cadastrar(Veiculos veiculos) {
		this.veiculos.add(veiculos);
		System.out.println("Veiculo Cadastrado");
		
	}

	@Override
	public void excluir(int indice) {
		this.veiculos.remove(indice);
		System.out.println("Veiculo Excluido");
	}
	public List<Veiculos> getVeiculos() {
		return veiculos;
	}
	

	//@Override
	//public void alterarDados(int indice, Veiculos veiculos) {
	//	this.veiculos.set(indice, veiculos);
	//	System.out.println("Dados Alterados");
		
	//}

	
	/*public void listarVeiculos () {
		for (Veiculo veiculo: veiculos) {
			
		} 
	} */
	
}


