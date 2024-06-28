package menu;

import java.util.Scanner;

public class MenuManutencaoCadastro {
	public static Scanner entrada = new Scanner (System.in);
	
	
	public static void exibirMenuManutencao() {
		
		System.out.println("---------------MANUTENÇÃO CADASTRO---------------");
		System.out.println("-------------------------------------------------");
		System.out.println("************** Selecione Uma Opção **************");
		System.out.println("-------------------------------------------------");
		System.out.println("|   1 - Gerenciar Veículo	                    |");
		System.out.println("|   2 - Gerenciar Loja	                        |");
		System.out.println("|   3 - Gerenciar Vendedor                      |");
		System.out.println("|   4 - Gerenciar Cliente                       |");
		System.out.println("|   5 - Gerenciar Venda                         |");
		System.out.println("-------------------------------------------------");

		int opcao = entrada.nextInt();
		switch (opcao) {
			
		case 1:
		MenuGerenciarVeiculo.exibirMenuVeiculo();
		break;
		// Eu criei os metodos e suas classes.
		case 2:
		MenuGerenciarLoja.exibirMenuLoja();
			break;
		case 3:
			MenuGerenciarVendedor.exibirMenuVendedor();
			break;
		case 4:
			MenuGerenciarCliente.exibirMenuCliente();
			break;
		case 5:
			MenuGerenciarVenda.exibirMenuVendas();
			break;
			
		}
	}
}
