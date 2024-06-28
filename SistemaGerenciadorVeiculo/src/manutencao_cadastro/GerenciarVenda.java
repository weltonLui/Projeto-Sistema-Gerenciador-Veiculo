package manutencao_cadastro;
import java.util.ArrayList;
import java.util.List;
import modelo.Vendas;
public class GerenciarVenda implements Gerenciadora<Vendas>{
	public static GerenciarVenda instance;
	private List <Vendas> vendas;

	private GerenciarVenda() {
		vendas = new ArrayList <> ();
	}
	public static synchronized GerenciarVenda getInstance () {
		if (instance == null) {
			instance = new GerenciarVenda ();
		}
		return instance;
		
	}
	
	@Override
	public void cadastrar(Vendas vendas) {
		this.vendas.add(vendas);
		System.out.println("Loja Cadastrada.");
	}

	@Override
	public void excluir(int indice) {
		this.vendas.remove(indice);
		System.out.println("Vendas excluida");	
	}
	public List<Vendas> getVendas() {
		return vendas;
	}
	public void listarVendas() {
		// TODO Auto-generated method stub
		
	}
	

	//@Override
	//public void alterarDados(int indice, Vendas vendas) {
	//	this.vendas.set(indice, vendas);
	//	System.out.println("Dados Alterados");
	//}
}