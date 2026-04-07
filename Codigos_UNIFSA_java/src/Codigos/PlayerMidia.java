package Codigos;
public class PlayerMidia {
 
	
	String titulo;
	public int duracao;
	boolean dandoplay;
	int contagem = 0;
	
	public void alternarplay() {
		contagem = contagem + 1;
		if (contagem % 2 == 0) {
			dandoplay = true;
			System.out.println("Título: "+titulo);
			System.out.println("Duração: "+duracao);
			System.out.println("Vídeo está rodando");
		}else if(contagem % 2 != 0) {
			dandoplay = false;
			System.out.println("O vídeo está pausado");
		}
	
	
	
	}
	}

	

