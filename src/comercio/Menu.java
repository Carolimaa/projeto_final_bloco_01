package comercio;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+          "*****************************************************");
			System.out.println("        Comércio de Legumes e Verduras               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Produto                    ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar produto por ID                ");
			System.out.println("            4 - Atualizar produto                    ");
			System.out.println("            5 - Finalizar                            ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("\nEntre com a opção desejada:                        ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD +"Bem vindo ao Comércio Virtual!");
								
				sobre();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE +"\nAdicionar o produto");

					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE +"\nListar todos os produtos");

					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE +"\nConsultar produto por ID");

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE +"\nAtualizar produto");

					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE +"\nFinalizar");

					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE +"\nMuito obrigada, volte sempre!!");
					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD +"\nOpção invalida"+ Cores.TEXT_RESET);
					break;

			}
        
		}
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Caroline Lima - carolniver12@gmail.com");
		System.out.println("https://github.com/Carolimaa");
		System.out.println("https://www.linkedin.com/in/caroline-lima-420431233/");
		System.out.println("\n*********************************************************");
}

	}


