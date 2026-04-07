package Codigos2;

public class Elevador {

	int AndarAtual = 0;
	int TotalAndares = 10;
	
	
	public void subir(int comando) {
		AndarAtual = AndarAtual + comando;
		if (AndarAtual > TotalAndares){
			System.out.println("Você não pode subir essa quantidade de andares");
		} else {
			System.out.println("Você está atualmente no: "+AndarAtual+"° andar");
		}
	}

	
	
	public void descer(int comando) {
		AndarAtual = AndarAtual - comando;
		if (AndarAtual< 0){
			System.out.println("Você não pode descer essa quantidade de andares");
		} else {
			System.out.println("Você está atualmente no: "+AndarAtual+"° andar");
		}
	}
}



