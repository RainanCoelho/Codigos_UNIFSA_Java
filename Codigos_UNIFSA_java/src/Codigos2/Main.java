package Codigos2;
import java.util.Scanner;
public class Main {

	public static void main(String[]args) {
		Elevador elevador = new Elevador();
		int vertical;
		boolean sistema = true;
		Scanner botao = new Scanner(System.in);
		
		while (sistema == true) {
		System.out.println("Você quer usar o elevador?(sim/não)");
		String querer = botao.nextLine();
		botao.nextLine();
		if (querer.equals("sim")) {	
		System.out.println("Qual o comando que você quer fazer: ");
		System.out.println("1 - Subir");
		System.out.println("2 - Descer");
		vertical = botao.nextInt();
		botao.nextLine();
		if (vertical == 1){
		System.out.println("Quantos andares você quer subir?");
		int subir = botao.nextInt();
		botao.nextLine();
		elevador.subir(subir);
		}else if(vertical == 2){
		System.out.println("Quantos andares você quer descer?");
		int descer = botao.nextInt();
		botao.nextLine();
		elevador.descer(descer);
		}else {
			System.out.println("Comando inválido");
		}
		}else if(querer.equals("não")) {
			sistema = false;
			System.out.println("Sistema encerrado");
			}else{
				System.out.println("Comando inválido");
			}
		}
	
	
	}

}
