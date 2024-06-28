package manutencao_cadastro;
import java.util.ArrayList;
import java.util.List;
import modelo.Vendedores;

	
public class GerenciarVendedor implements Gerenciadora <Vendedores> {
	
	private static GerenciarVendedor instance;
	private List <Vendedores> vendedores;

	private GerenciarVendedor() {
		vendedores = new ArrayList<>();
	}
	
	public static synchronized GerenciarVendedor getInstance() {
		if (instance == null) {
			instance = new GerenciarVendedor();
		}
		return instance;
	}
	
	@Override
	public void cadastrar(Vendedores vendedores ) {
		this.vendedores.add(vendedores);
		System.out.println("Vendedores Cadastrado.");
		
	}

	@Override
	public void excluir(int indice) {
		this.vendedores.remove(indice);
		System.out.println("Vendedores Excluido");
	}

	public Object getVendedores() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] consultarVendedorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	

	//@Override
	//public void alterarDados(int indice, Vendedores vendedores) {
	//	this.vendedores.set(indice, vendedores);
	//	System.out.println("Dados Alterados");
	//}

}

