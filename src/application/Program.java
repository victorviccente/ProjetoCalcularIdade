package application;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import entities.Person;

public class Program {

	public static void main(String[] args) throws InterruptedException {

		Scanner scanner = new Scanner(System.in);
		LocalDate localDate = LocalDate.now();

		System.out.println("----------------TELA DE CADASTRO--------------------");
		System.out.println("DATA DO SISTEMA " + localDate);

		System.out.print("\nDigite o nome do primeiro usuário: ");
		String nomePessoa1 = scanner.nextLine();

		System.out.println("\nDigite abaixo a data de nascimento do usuário:");
		System.out.print("Dia: ");
		int diaPessoa1 = scanner.nextInt();
		System.out.print("Mês: ");
		int mesPessoa1 = scanner.nextInt();
		System.out.print("Ano: ");
		int anoPessoa1 = scanner.nextInt();

		Person pessoa1 = new Person(nomePessoa1, diaPessoa1, mesPessoa1, anoPessoa1);

		pessoa1.calculaIdade();

		System.out.println("\nInserindo informações no sistema...");
		TimeUnit.SECONDS.sleep(2);

		System.out.println("\nNome cadastrado no sistema: " + pessoa1.informaNome());
		System.out.println("Idade cadastrada no sistema: " + pessoa1.informaIdade());

		System.out.print("\nDigite o nome do segundo usuário: ");
		scanner.nextLine();
		String nomePessoa2 = scanner.nextLine();

		System.out.println("\nDigite a data de nascimento do segundo usuário:");
		System.out.print("Dia: ");
		int diaPessoa2 = scanner.nextInt();
		System.out.print("Mês: ");
		int mesPessoa2 = scanner.nextInt();
		System.out.print("Ano: ");
		int anoPessoa2 = scanner.nextInt();

		Person pessoa2 = new Person(nomePessoa2, diaPessoa2, mesPessoa2, anoPessoa2);

		pessoa2.calculaIdade();

		System.out.println("\nInserindo informações no sistema...");

		TimeUnit.SECONDS.sleep(2);

		System.out.println("\nNome cadastrado no sistema: " + pessoa2.informaNome());
		System.out.println("Idade cadastrada no sistema: " + pessoa2.informaIdade());

		TimeUnit.SECONDS.sleep(2);

		System.out.println("\nVerificando se os cadastros foram realizados com sucesso...");

		TimeUnit.SECONDS.sleep(4);

		System.out.println("\nAMBOS OS USUÁRIOS FORAM CADASTRADOS COM SUCESSO!");
		System.out.println("\nDATA DE CADASTRO DOS NOVOS USUÁRIOS NO SISTEMA: " + localDate);

		scanner.close();
	}

}