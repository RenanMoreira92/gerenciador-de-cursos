package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Renan Moreira");
		alunos.add("Antonio Cesar");
		alunos.add("Anayá Oni");
		alunos.add("Bruna Cristine");
		alunos.add("Gustavo Moreira");
		alunos.add("Sandra Pereira");
		
		boolean estaMatriculado = alunos.contains("Renan Moreira");
		System.out.println(estaMatriculado);
		
		System.out.println(alunos);
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
