package br.com.universoMakers.main;

//Programa cadastra alunos e notas e no final calcula a média total da sala
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.universoMakers.modelo.Aluno;

public class Principal {
	public static void main(String[] args) {
		double totalNota = 0;
		int sair = 1;
		int j = 0;

		List<Aluno> alunos = new ArrayList<Aluno>();

		while (sair == 1) {

			Aluno a = new Aluno();
			alunos.add(a);

			System.out.println("Digite o nome do aluno: ");
			Scanner id = new Scanner(System.in);
			String nome = id.nextLine();

			System.out.println("Digite a nota do aluno: ");
			Scanner nota = new Scanner(System.in);
			double notas = nota.nextDouble();

			alunos.get(j).setNome(nome);
			alunos.get(j).setNota(notas);

			j++;

			System.out.println("Para continuar cadastrando digite 1 ou 0 para sair");
			Scanner out = new Scanner(System.in);
			sair = out.nextInt();
		}

		for (int i = 0; i < j; i++) {

			System.out.println("Dados do Aluno");
			System.out.println("Aluno: " + alunos.get(i).getNome());
			System.out.println("Nota: " + alunos.get(i).getNota());

			totalNota += alunos.get(i).getNota();

		}

		totalNota = totalNota / j;
		System.out.println("Total de " + j + " cadastrados, a média da sala e: " + totalNota);
	}

}