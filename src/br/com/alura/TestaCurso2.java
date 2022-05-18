package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleçoes", 22));

		List<Aula> aulasImutavel = javaColecoes.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutavel);
		
		
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		

	}

}
