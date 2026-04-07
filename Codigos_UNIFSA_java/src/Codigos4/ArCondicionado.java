package Codigos4;

public class ArCondicionado {

	int temperatura;
	
	public void Selec_Temperatura(int temperatura) {
		if ((temperatura < 16) || (temperatura > 28)) {
			System.out.println("Não se pode selecionar essa temperatura");
		}else {
			System.out.println("Sua temperatura é: "+temperatura);
		}
	}
	
}
