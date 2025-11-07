package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Ruan");
		Aluno aluno2 = new Aluno("Kathy");
		Aluno aluno3 = new Aluno("Leon");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("SQL");
		Curso curso3 = new Curso("Python");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		System.out.println("Curso " + curso1.nome);
		for (Aluno aluno: curso1.alunos) {
			System.out.println(aluno.nome);
		}
		
		System.out.println("\nCurso " + curso2.nome);
		for (Aluno aluno: curso2.alunos) {
			System.out.println(aluno.nome);
		}
		
		System.out.println("\nCurso " + curso3.nome);
		for (Aluno aluno: curso3.alunos) {
			System.out.println(aluno.nome);
		}
		
		System.out.println("\nGet alunos: " + aluno1.cursos.get(0).alunos);
		System.out.println("Get cursos: " + curso3.alunos.get(1).cursos);
		
		System.out.println("Obter cursos: ");
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
