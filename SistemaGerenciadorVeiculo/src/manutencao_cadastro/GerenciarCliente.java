package manutencao_cadastro;
import java.util.ArrayList;
import java.util.List;
import modelo.Clientes;

public class GerenciarCliente implements Gerenciadora<Clientes> {
	
	private static GerenciarCliente instance;
	private List <Clientes> clientes;
	
	private GerenciarCliente() {
		clientes = new ArrayList <> ();
	}
	
	public static synchronized GerenciarCliente getInstance() {
		if (instance == null) {
			instance = new GerenciarCliente();
		}
		return instance;
	}
	
	@Override
	public void cadastrar(Clientes cliente) {
		this.clientes.add(cliente);
		System.out.println("Cliente Cadastrado");
	}

	@Override
	public void excluir(int indice) {
		this.clientes.remove(indice);
		System.out.println("Cliente Excluido"); 
	}

	public List<Clientes> getClientes() {
		return clientes;
	}

	public void setClientes(List<Clientes> clientes) {
		this.clientes = clientes;
	}

	public char[] consultarClienteCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
