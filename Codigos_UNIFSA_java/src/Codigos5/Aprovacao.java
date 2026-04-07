package Codigos5;

public class Aprovacao {

	int nota;
	int presenca;
	
	public void calcular(int nota, int presenca) {
		if ((nota < 7) || (presenca < 75)) {
			System.out.println("Aluno Reprovado");
		}else {
			System.out.println("Aluno Aprovado");
		}
			}
	
	
}
