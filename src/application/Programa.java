package application;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("\n---------------------HOME-------------------");
			System.out.println("1 - \t Ver tabela de classificação (IMC)");
			System.out.println("2 - \t Calcular IMC");
			System.out.println("0 - \t Encerrar");
			System.out.println("--------------------------------------------");

			System.out.print("\nInforme uma opção: ");
			opcao = sc.nextInt();

			while (opcao != 1 && opcao != 2 && opcao != 0) {
				System.out.println("Opção fora do intervalo!");
				System.out.println("Informe uma opção: ");
				opcao = sc.nextInt();
			}

			switch (opcao) {

			case 1:
				System.out.println("\n----------------Classificação-----------------");
				System.out.println("imc < 18,5: Abaixo do peso.");
				System.out.println("IMC 18,5 a 24,9: Peso normal.");
				System.out.println("IMC 25,0 a 29,9: Sobrepeso.");
				System.out.println("IMC 30,0 a 34,9: Obesidade Grau I.");
				System.out.println("IMC 35,0 a 39,9: Obesidade Grau II.");
				System.out.println("IMC 40,0 ou acima: Obesidade Grau III (Mórbida).");
				System.out.print("\nDigite qualquer número para voltar ao menu: ");
				sc.nextInt();
				break;

			case 2:
				int repetir;

				do {
					System.out.println("\n----------------Calcular IMC------------------");

					double altura;
					do {
						System.out.print("Informe sua altura: ");
						altura = sc.nextDouble();
						if (altura <= 0) {
							System.out.println("Valor inválido!");
						}
					} while (altura <= 0);

					double peso;
					do {
						System.out.print("Informe seu peso: ");
						peso = sc.nextDouble();
						if (peso <= 0) {
							System.out.println("Valor inválido!");
						}
					} while (peso <= 0);

					double imc = peso / Math.pow(altura, 2);

					System.out.println("\nIMC = " + String.format("%.2f", imc));
					System.out.print("Classificação: ");

					if (imc < 18.5) {
						System.out.println("Abaixo do peso.");
					} else if (imc <= 24.9) {
						System.out.println("Peso normal.");
					} else if (imc <= 29.9) {
						System.out.println("Sobrepeso.");
					} else if (imc <= 34.9) {
						System.out.println("Obesidade Grau I.");
					} else if (imc <= 39.9) {
						System.out.println("Obesidade Grau II.");
					} else {
						System.out.println("Obesidade Grau III.");
					}

					System.out.println("\n1 - Calcular novamente");
					System.out.println("0 - Voltar ao menu");
					System.out.print("Informe uma opção: ");
					repetir = sc.nextInt();

				} while (repetir == 1);
				break;

			case 3:
				System.out.println("Encerrando o programa...");
			}

		} while (opcao != 0);

		sc.close();

	}

}
