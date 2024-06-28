package menu;
import java.util.Scanner;

import manutencao_cadastro.GerenciarVeiculo;
import modelo.TiposDeVeiculos;
import modelo.Veiculos;
public class MenuGerenciarVeiculo {

	public static Scanner entrada = new Scanner (System.in);
	private static GerenciarVeiculo gerenciarVeiculo= GerenciarVeiculo.getInstance();
	//private static MenuManutencaoCadastro manutencaoCadastro;

	public static void exibirMenuVeiculo()   {
		System.out.println("|------------Menu Veiculo--------------|");
		System.out.println("|*********Selecione Uma Opção**********|");
		System.out.println("|--------------------------------------|");
		System.out.println("| 1- Cadastrar Veiculo                 |");
		System.out.println("| 2- Excluir Veiculo                   |");
		System.out.println("| 3- Alterar Dados Veiculo             |");
		System.out.println("| 4- Menu Superior                     |");
		System.out.println("|--------------------------------------|");

		int opcao = entrada.nextInt();
		switch(opcao) {
		case 1:
			cadastrarVeiculo();
			break;
		case 2:
			excluirVeiculo();
			break;
		case 3:
			alterarDados ();
		case 4:
			MenuManutencaoCadastro.exibirMenuManutencao();
			break;
		default:
			System.out.println("Opção invalida. ");
			exibirMenuVeiculo();
			break;
		}
	}

	public static void cadastrarVeiculo () {

		System.out.println("Digite a marca do veiculo: ");
		String marca = entrada.next();
		System.out.println("Digite o modelo do veiculo: ");
		String modelo = entrada.next();
		System.out.println("Digite o ano do veiculo: ");
		int ano = entrada.nextInt();
		System.out.println("Digite a placa do veiculo: ");
		String placa = entrada.next();
		System.out.println("Digite o preco do Veiculo: ");
		double preco = entrada.nextDouble();
		System.out.println("Digite o categoria do Veiculo: ");
		String categoria = entrada.next();
		System.out.println("Digite a Descricao do Veiculo ");
		String descricao = entrada.next();
		TiposDeVeiculos tiposDeVeiculos = new TiposDeVeiculos(categoria, descricao);
		Veiculos veiculo = new Veiculos(marca,modelo, ano,placa,preco,tiposDeVeiculos);

		GerenciarVeiculo.getInstance().cadastrar(veiculo);
	}
	public static void excluirVeiculo() {
		if (gerenciarVeiculo.getVeiculos().size() > 0) {
			System.out.println("Informe o ID do Veiculo:");
			int idVeiculo = entrada.nextInt();
			if(idVeiculo >= 1 && idVeiculo <= gerenciarVeiculo.getVeiculos().size()) {
				gerenciarVeiculo.excluir(idVeiculo -1);
				for(int i = idVeiculo -1; i < gerenciarVeiculo.getVeiculos().size(); i++) {
					gerenciarVeiculo.getVeiculos().get(i).setIdVeiculos(gerenciarVeiculo.getVeiculos()
							.get(i).getIdVeiculo() -1);

				}
			} else {
				System.out.println("O veuculo não existe");
			}
		}else {

			System.out.println("Não há Veiculo Cadastrados");
		}
		exibirMenuVeiculo();
	}
	public static void alterarDados() {
		if(gerenciarVeiculo.getVeiculos().size() > 0) {
			System.out.println("Informe o Id do veiculo");
			int idVeiculo = entrada.nextInt();
			if(idVeiculo -1 < gerenciarVeiculo.getVeiculos().size()) {
				Veiculos veiculo = gerenciarVeiculo.getVeiculos().get(idVeiculo -1);
				if(gerenciarVeiculo.getVeiculos().contains(veiculo)) {
					System.out.println("Informe o campo que deseja alterar:");
					System.out.println("""
							1 - Marca
							2 - Modelo
							3 - Ano
							4 - Placa
							5 - Preço
							6 - Categoria
							7 - Descrição
							""");
					int opcao = entrada.nextInt();	
					switch(opcao) {
					case 1:
						System.out.println("Informe a Nova Marca:");
						String novaMarca = entrada.next();
						veiculo.setMarca(novaMarca);;
						break;
					case 2:
						System.out.println("Informe o novo Modelo: ");
						String novoModelo = entrada.next();
						veiculo.setModelo (novoModelo);
						break;
					case 3:
						System.out.println("Informe o novo Ano:");
						int novoAno = entrada.nextInt();
						veiculo.setAno(novoAno);
						break;
					case 4:
						System.out.println("Informe a nova placa:");
						String novaPlaca = entrada.next();
						veiculo.setPlaca(novaPlaca);
					case 5:
						System.out.println("Informe o novo preco: ");
						double novoPreco = entrada.nextDouble();
						veiculo.setPreco(novoPreco);
					case 6:
						entrada.nextLine();
						System.out.println("Informe a nova descrição:");
						String novaDescricao = entrada.nextLine();
						veiculo.getTipoDeVeiculos().setCategoria(novaDescricao);
						break;
					case 7:
						System.out.println("Informe a nome categoria:");
						String novaCategoria = entrada.next();
						veiculo.getTipoDeVeiculos().setCategoria(novaCategoria);
					default:
						System.out.println("Opção Inválida");
						exibirMenuVeiculo();
						break;

					}
				}else {
					System.out.println("Veiculo não Encontrado:");
					exibirMenuVeiculo();
				}
			}else {
				System.out.println("Não há veiculos cadastrados.");
			}
			exibirMenuVeiculo();
		}
	}
}

