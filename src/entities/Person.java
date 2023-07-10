package entities;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String nome;
	private int idade;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;

	public Person(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
		this.nome = nome;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}

	public void calculaIdade() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
		Period periodo = Period.between(dataNascimento, dataAtual);
		idade = periodo.getYears();
	}

	public int informaIdade() {
		return idade;
	}

	public String informaNome() {
		return nome;
	}
}