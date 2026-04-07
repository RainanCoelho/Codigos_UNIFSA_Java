package Codigos6;

public class Personagem {

	int dano;
	int vida;
	int escudo;
	
	public void ReceberDano(int dano,int escudo,int vida) {
		escudo  = escudo - dano;
		if (escudo >= 0) {
			System.out.println("O seu personagem possui "+escudo+" de escudo e "+vida+" de vida!");
		}else if (escudo < 0) {
			vida = vida + (escudo);
			System.out.println("O seu personagem possui 0 de escudo e "+vida+ " de vida");
		}
	}
}
