package Codigos3;

public class Pet {

	int fome;
	
	public void alimentar(int fome) {
		fome -= 10;
		if (fome < 0) {
			fome = 0;
		
		}
		System.out.println("Fome: "+fome);
	}
}
