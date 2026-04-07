package Codigos4;
import java.util.Scanner;
public class Main {

	public static void main(String[]args) {
		ArCondicionado LG = new ArCondicionado();
		Scanner controle = new Scanner(System.in);
		
		System.out.println("Selecione a sua temperatura");
		int temperatura = controle.nextInt();
		LG.Selec_Temperatura(temperatura);
		
		
	}
}
