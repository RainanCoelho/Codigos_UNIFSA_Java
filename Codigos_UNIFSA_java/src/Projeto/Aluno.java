package Projeto;

public class Aluno {

	String nome;
	String matricula;
	private double nota_final;
	
	public Aluno(String nome, String matricula, double nota_final) {
		this.nome = nome;
		if (nome.isEmpty()) {
			System.out.println("Dados inválidos para aluno");
		}else {
			System.out.println("Dados válidos para o aluno");
		}
		this.matricula = matricula;
		this.nota_final = nota_final;
	}

	public double getNota_final() {
		return nota_final;
	}

	public void setNota_final(double nota_final) {
		this.nota_final = nota_final;
		if ((nota_final > 0)&&(nota_final < 10)) {
			System.out.println("Notas aceitas");
		}else {
			System.out.println("Notas inválidas");
		}
	}

	public void ajustarNota(double novaNota) {
		setNota_final(novaNota);
		
	}
	
	
	public void exibirDados() {
		System.out.println("------Informações do aluno-------");
		System.out.println("Nome do aluno: "+nome);
		System.out.println("Matrícula do aluno: "+matricula);
		System.out.println("Nota final do aluno: "+getNota_final());
	
	
	}


	
}
