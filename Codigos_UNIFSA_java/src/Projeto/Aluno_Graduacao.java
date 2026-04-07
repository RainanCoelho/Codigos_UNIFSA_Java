package Projeto;

public class Aluno_Graduacao extends Aluno {

	
	public Aluno_Graduacao(String nome, String matricula, double nota_final) {
		super(nome, matricula, nota_final);		
	}
	
	public void verificarAprovacao(double nota_final) {
		if (nota_final < 7) {
			System.out.println("Aluno não aprovado!");
		}else {
			System.out.println("Aluno aprovado");
		}
	}
	
	public void ajustarNota(double novaNota) {
		super.ajustarNota(novaNota);
		if ((novaNota > 0)&&(novaNota < 10)) {
			System.out.println("Notas aceitas");
		}else {
			System.out.println("Notas inválidas");
		}

	}
}
