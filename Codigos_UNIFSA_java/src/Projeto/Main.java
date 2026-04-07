package Projeto;

public class Main {

	public static void main(String[]args) {
		
	Aluno aluno = new Aluno("Rainan","1234567",9);
	Aluno_Graduacao aluno2 = new Aluno_Graduacao("João","98765432",7);
	Aluno_Pos aluno3 = new Aluno_Pos("Maria","876849",5);
	
	/*aluno2.verificarAprovacao(10);
	aluno3.verificarAprovacao(9);
	aluno2.ajustarNota(3);*/
	
	
	aluno2.exibirDados();
	aluno3.exibirDados();
	
	
	}
	
}
