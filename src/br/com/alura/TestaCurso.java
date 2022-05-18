package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		List<Aula> aulas = javaColecoes.getAulas();

		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleçoes", 22));
		
		

		System.out.println(javaColecoes.getAulas());

	}

}
