package oo.composicao;

import java.util.List;
import java.util.ArrayList;

public class Curso {
	
	String nome;
	String aluno;
	
	List<Aluno> alunos = new ArrayList<>();
	
	Curso (String nome) {
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	public String toString () {
		return nome;
	}

}
