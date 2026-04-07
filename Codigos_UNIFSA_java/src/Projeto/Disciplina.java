package Projeto;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	
	String nome;
	String professorResponsavel;
	Aluno aluno;
	private List<Aluno> listaAlunos;
	
	
	public List<Aluno> getListaAlunos() {
		return listaAlunos;
	}
	public void setListaAlunos(List<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	
	public Disciplina(String nome, String professorResponsavel, String listaAlunos,Aluno aluno) {
		this.nome = nome;
		this.professorResponsavel = professorResponsavel;
		if (this.professorResponsavel == null) {
			System.out.println("Nome de professor não pode ser nulo!!");
		}
		this.listaAlunos = new ArrayList<>();
		this.aluno = aluno;
	}
	
	
	public void adicionarAluno(Aluno aluno) {
		if (listaAlunos.contains(aluno)) {
			System.out.println("Aluno já está presente na lista");
		}else {
			listaAlunos.add(aluno);
		}
	
	}

	public void removerAluno(Aluno aluno) {
		listaAlunos.remove(aluno);
		
	}
	
	public void listarAluno() {
	System.out.println("Lista de alunos: "+ listaAlunos);
	}
	
	
}
