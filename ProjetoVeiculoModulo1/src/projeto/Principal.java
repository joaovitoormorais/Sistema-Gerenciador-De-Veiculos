package projeto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao;
		
		do {
			exibirMenuPrincipal();
			opcao = scan.nextInt();
			scan.nextLine();
			
			switch(opcao) {
			case 1:
 				MenuFrenteLoja(scan);
				break;
			case 2:
				menuManutencaoCadastro(scan);
			break;
		 	case 3:
				System.out.println("Saindo do programa!");
			break;
		default:
			System.out.println("Errou, escolha uma opção válida.");
				}
				
			}while(opcao != 3);
		scan.close();
		
	}
		
		public static void exibirMenuPrincipal() {
			System.out.println("\nExibir Menu Principal:");
			System.out.println("1- Frente de loja");
			System.out.println("2- Manutenção do cadastro");
			System.out.println("Opção:");
		}
		
	public static void MenuFrenteLoja(Scanner scan) {
		
		int opcao;
		
		do {
			exibirMenuFrenteLoja();
			opcao = scan.nextInt();
			scan.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("Opçao 1 escolhida.");
				break;
			case 2:
				System.out.println("Opção 2 escolhida.");
				break;
			case 3:
				System.out.println("Opção 3 escolhida.");
				break;
			case 4:
				System.out.println("Opção 4 escolhida.");
				break;
			case 5:
				System.out.println("Opção 5 escolhida.");
				break;
			case 6:
				System.out.println("Voltando para o menu principal");
				break;
			default:
				System.out.println("Errou, tente novamente.");
			}
				
			}while(opcao != 6);
	}
	
	public static void exibirMenuFrenteLoja() {
		System.out.println("\nMenu frente loja:");
		System.out.println("1- Opção 1: Vender veículo");
		System.out.println("2- Opção 2: Consultar vendedor");
		System.out.println("3- Opção 3: Gerenciar estoque de vendas");
		System.out.println("4- Opção 4: Visualizar horário de funcionamento da loja");
		System.out.println("5- opção 5: Gerenciar informações sobre a compra");
		System.out.println("6- Voltar para o menu principal.");
		System.out.println("Opção:");
	}
	
	public static void menuManutencaoCadastro(Scanner scan) {
	
		int opcao;
		do {
			exbirmenuManutencaoCadastro();
			opcao = scan.nextInt();
			scan.nextLine();
			
			switch(opcao) {
			
			case 1:
				System.out.println("Gerenciar veículo");
				break;
			case 2:
				System.out.println("Gerenciar venda");
				break;
			case 3:
				System.out.println("Gerenciar vendedor");
				break;
			case 4:
				System.out.println("Gerenciar loja");
				break;
			case 5:
				System.out.println("Gerenciar cliente");
				break;
			case 6:
				System.out.println("Voltando para o menu principal.");
				break;
			default:
				System.out.println("Opção errada, tente mais uma vez .");
			}
		} while(opcao != 6);
	}
	
	public static void exbirmenuManutencaoCadastro() {
		
		System.out.println("\nExibir Manutenção de cadastro:");
		System.out.println("1- Gerenciar veículo");
		System.out.println("2- Gerenciar venda");
		System.out.println("3- Gerenciar vendedor");
		System.out.println("4- Gerenciar loja");
		System.out.println("5- Gerenciar cliente");
		System.out.println("6- Voltar para o menu principal");
		System.out.println("Opção:");
	}
}
	


