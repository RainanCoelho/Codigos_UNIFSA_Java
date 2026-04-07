package Codigos;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		

	PlayerMidia video = new PlayerMidia();
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Qual o titulo do seu video: ");
	video.titulo = leitor.nextLine();
	System.out.println("Qual a duração do seu video em segundos: ");
	video.duracao = leitor.nextInt();
	
	video.alternarplay();
	
	
	
}
}