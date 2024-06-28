package manutencao_cadastro;
import modelo.Lojas;


import java.util.ArrayList;
import java.util.List;

public class GerenciarLojas implements Gerenciadora<Lojas> {
	private static GerenciarLojas instance;
	private List <Lojas> lojas;

	private GerenciarLojas() {
		lojas = new ArrayList <> ();
	}
	public static synchronized GerenciarLojas getInstance() {
		if (instance == null) {
			instance = new GerenciarLojas();
		}
		return instance;
	}
	
	@Override
	public void cadastrar(Lojas lojas) {
		this.lojas.add(lojas);
		System.out.println("Loja Cadastrada.");
	}

	@Override
	public void excluir(int indice) {
		this.lojas.remove(indice);
		System.out.println("Loja excluida");	
	}

	//@Override
	//public void alterarDados(int indice, Lojas objeto) {
	//	this.lojas.set(indice, objeto);
	//	System.out.println("Dados Alterados");
	//}

	public List<Lojas> getVeiculos() {
		return lojas;
	}
	public Object getLojas() {
		// TODO Auto-generated method stub
		return null;
	}
	public void listarLojas() {  
		// TODO Auto-generated method stub
		
	}


}
