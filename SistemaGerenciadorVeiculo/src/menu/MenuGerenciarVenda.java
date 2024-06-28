package menu;

import java.util.Scanner;

import manutencao_cadastro.GerenciarVenda;
import manutencao_cadastro.GerenciarCliente;
import manutencao_cadastro.GerenciarVeiculo;
import manutencao_cadastro.GerenciarVendedor;
import modelo.Clientes;
import modelo.Veiculos;
import modelo.Vendas;
import modelo.Vendedores;

public class MenuGerenciarVenda {

	public static Scanner entrada = new Scanner (System.in);
	private static GerenciarVenda gerenciarVenda = GerenciarVenda.getInstance();
	private static GerenciarVeiculo gerenciarVeiculo =  GerenciarVeiculo.getInstance();
	private static GerenciarVendedor gerenciarVendedor = GerenciarVendedor.getInstance();
	private static GerenciarCliente gerenciarCliente = GerenciarCliente.getInstance();
	
	public static void exibirMenuVendas() {
		System.out.println("------------------- MENU VENDAS -------------------");
		System.out.println("---------------------------------------------------");
		System.out.println("*************** Selecione Uma Opção ***************");
		System.out.println("----------------------------------------------------");
		System.out.println("|   1 - Cadastrar Venda                            |");
		System.out.println("|   2 - Excluir Venda                              |");
		System.out.println("|   3 - Alterar Dados Venda                        |");
		System.out.println("|   4 - Menu Superior                              |");
		System.out.println("----------------------------------------------------");
		

		int opcao = entrada.nextInt();
		switch(opcao) {
		case 1:
			cadastrarVenda();
			break;
		case 2:
			excluirVenda();
			break;
		case 3:               
			alterarDados ();   
		case 4:
			MenuManutencaoCadastro.exibirMenuManutencao(); 
			break;
		default:
			System.out.println("Opção Inválida.");
			exibirMenuVendas();
			break;
		}
	}	
	
	public static void cadastrarVenda() {
		entrada.nextLine();
		System.out.println("Informe a Data da Venda: Ex. DD/MM/AAAA");
		String dataVenda = entrada.nextLine();
		System.out.println("Informe o ID do Veículo Vendido:");
		int idVeiculoVendido = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Informe o ID do Vendedor Responsável:");
		int idVendedorResponsavel = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Informe o ID do Cliente:");
		int idCliente = entrada.nextInt();
		entrada.nextLine();		
		
	    Veiculos veiculo = GerenciarVeiculo.getInstance().getVeiculos().get(idVeiculoVendido - 1);
	    Vendedores vendedor = GerenciarVendedor.getInstance().getVendedores().get(idVendedorResponsavel - 1);
	    Clientes cliente = GerenciarCliente.getInstance().getClientes().get(idCliente - 1);
		
		Vendas venda = new Vendas(veiculo, vendedor, cliente, dataVenda);
        gerenciarVenda.cadastrar(venda);
        System.out.println("ID Venda: " + venda.getIdVenda());
        System.out.println(GerenciarVenda.getInstance().getVendas().size());
		exibirMenuVendas();
	}
	
	public static void excluirVenda() {
		if(gerenciarVenda.getVendas().size() > 0) {
			System.out.println("Informe o ID da Venda:");
			int idVenda = entrada.nextInt();
			if(idVenda >= 1 && idVenda <= gerenciarVenda.getVendas().size()) {
				gerenciarVenda.excluir(idVenda - 1);
				for(Vendas venda : gerenciarVenda.getVendas()) {
					venda.setIdVenda(venda.getIdVenda() - 1);
				}
			}else {
				System.out.println("A venda não existe.");
			}
		}else {
			System.out.println("Não há Vendas Cadastradas.");
		}
		exibirMenuVendas();
	}
	
	public static void alterarDados() {
		if(gerenciarVenda.getVendas().size() > 0) {
			System.out.println("Informe o ID da Venda:");
			int idVenda = entrada.nextInt();
			if(idVenda - 1 < gerenciarVenda.getVendas().size()) {
				Vendas venda = gerenciarVenda.getVendas().get(idVenda - 1);
				if(gerenciarVenda.getVendas().contains(venda)) {
					System.out.println("Informe o Campo que Deseja Alterar:");
					System.out.println("""
							1 - Veículo Vendido
							2 - Vendedor Responsável
							3 - Cliente
							4 - Data da Venda
							""");
					int opcao = entrada.nextInt();
					
					switch(opcao) {
						case 1:
							System.out.println("Informe o ID do Novo Veículo:");
							int idVeiculo = entrada.nextInt();
							Veiculos novoVeiculo = gerenciarVeiculo.getVeiculos().get(idVeiculo - 1);
							venda.setVeiculoVendido(novoVeiculo);
							break;
						case 2:
							System.out.println("Informe o ID do Novo Vendedor:");
							int idVendedor = entrada.nextInt();
							Vendedores novoVendedor = gerenciarVendedor.getVendedores().get(idVendedor - 1);
							venda.setVendedorResponsavel(novoVendedor);
							break;
						case 3:
							System.out.println("Informe o ID do Novo Cliente:");
							int idCliente = entrada.nextInt();
							Clientes novoCliente = gerenciarCliente.getClientes().get(idCliente - 1);
							venda.setClienteComprador(novoCliente);
							break;
						case 4:
							System.out.println("Informe a Nova Data da Venda:");
							String novaData = entrada.nextLine();
							venda.setDataVenda(novaData);
							break;
						default:
							System.out.println("Opção Inválida:");
							exibirMenuVendas();
							break;
					}
				}
			}else {
				System.out.println("Venda Não Encontrada.");
				exibirMenuVendas();
			}
		}else {
			System.out.println("Não há Vendas Cadastradas.");
		}
		exibirMenuVendas();
	}
}





