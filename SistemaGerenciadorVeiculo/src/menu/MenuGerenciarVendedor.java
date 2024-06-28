package menu;

import java.util.Scanner;
import manutencao_cadastro.GerenciarVendedor;
import modelo.Vendedores;

public class MenuGerenciarVendedor {

	public static Scanner entrada = new Scanner (System.in);
	private static GerenciarVendedor gerenciarVendedor = GerenciarVendedor.getInstance();//private static MenuManutencaoCadastro manutencaoCadastro;

	public static void exibirMenuVeiculo()   {

		System.out.println("|---------------------------------------|");
		System.out.println("| 1- Cadastrar Vendedor                 |");
		System.out.println("| 2- Excluir Vendedor                   |");
		System.out.println("| 3- Alterar Dados Vendedor             |");
		System.out.println("| 4- Menu Superior                      |");
		System.out.println("|---------------------------------------|");

		int opcao = entrada.nextInt();
		switch(opcao) {
		case 1:
			cadastrarVendedor();
			break;
		case 2:
			excluirVendedor();
			break;
		case 3:
			alterarDados ();
		case 4:
			MenuManutencaoCadastro.exibirMenuManutencao();
			break;
		default:
			System.out.println("Opção Inválida");
			exibirMenuVendedor();
			break;
		}
	}
	
	private static void cadastrarVendedor() {
		entrada.nextLine();
		System.out.println("Digite o nome do vendedor");
		String nome = entrada.nextLine();
		System.out.println("Digite o salario do Vendedor");
		double salario = entrada.nextDouble();
		entrada.nextLine();
		System.out.println("Digite o cpf do vendedor");
		String cpf = entrada.nextLine();
		String telefone = entrada.nextLine ();
		
		Vendedores vendedor = new Vendedores (nome,cpf,telefone,salario);
		
		GerenciarVendedor.getInstance().cadastrar(vendedor);
		System.out.println("ID Vendedor: "+ vendedor.getIdVendedor());
		System.out.println("Nome:"+ vendedor.getTelefone());
		System.out.println("Cpf:" + vendedor.getCpf());
		System.out.println("Telefone"+ vendedor.getTelefone());
		System.out.println("Salario: R$" + vendedor.getSalario());
		
		System.out.println(GerenciarVendedor.getInstance().getVendedores().size());
		exibirMenuVendedor();
		
	}
	public static void excluirVendedor() {
		if(gerenciarVendedor.getVendedores().size() > 0) {
			System.out.println("Informe o ID do Vendedor");
			int idVendedor = entrada.nextInt();
			if(idVendedor >= 1 && idVendedor <= gerenciarVendedor.getVendedores().size()) {
				gerenciarVendedor.excluir(idVendedor - 1);
				for(int i = idVendedor - 1; i < gerenciarVendedor.getVendedores().size(); i++) {
					gerenciarVendedor.getVendedores().get(i).setIdVendedor(gerenciarVendedor.getVendedores()
							.get(i).getIdVendedor() - 1);
					Vendedores.setContador(Vendedores.getContador() - 1);
				}
			}else {
				System.out.println("O Vendedor não existe");
			}
		}else {
			System.out.println("Não há Vendedores Cadastrados");
		}
		exibirMenuVendedor();
	}
	
	private static void alterarDados() {
		if(gerenciarVendedor.getVendedores().size () > 0) {
			System.out.println("Informe o Id do Vendedor");
			int idVendedor = entrada.nextInt();
			if(idVendedor -1 < gerenciarVendedor.getVendedores().size()) {
				Vendedores vendedor = gerenciarVendedor.getVendedores().get(idVendedor - 1);
			if(gerenciarVendedor.getVendedores().contains(vendedor)) {
				
				System.out.println("Informe o campo que deseja Alterar:");
				System.out.println("""
						1 - Nome
						2 - CpF
						3 - Telefone
						4 - Salário
						""");
				int oppcao = entrada.nextInt();
				switch(opcao) {
				case 1:
					System.out.println("Informe o novo nome: ");
					String novoNome = entrada.nextLine();
					break;
				case 2:
					System.out.println("Informe o Novo Cpf: ");
					String novoCPF = entrada.nextLine();
					break;
				case 3:
					System.out.println("Informe o novo telefone: ");
					String novoTelefone = entrada.nextLine();
					break;
				case 4:
					System.out.println("Informe o novo salario: ");
					double novoSalario = entrada.nextDouble();
					vendedor.setSalario(novoSalario);
					break;
					default:
						System.out.println("Opção invalida:");
						exibirMenuVendedor();
						break;
				}
			}
			else {
				System.out.println("Vendedor não encontrado");
				exibirMenuVendedor();
			}
			
			}
		} else {
			System.out.println("Não há vendedores cadastrados:");
		}
		exibirMenuVendedor();

	}

	public static void exibirMenuVendedor() {
		// TODO Auto-generated method stub
	}

}


