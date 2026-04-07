package Atividade_PoliHera;

public class GestaoLogistica {

	 public static void main(String[] args) {
	       // Exemplo de como eles devem começar:
	        
	        Rota rota = new Rota();
	        rota.precoCombustivel = 20000;
	        
		    Carga carga = new Carga();
		    carga.descricao = "Celular";
		    carga.peso = 2000.0;
	        
		    Motorista mot1 = new Motorista();
	        mot1.nome = "Joaquim";
	        mot1.cnh = "123456-A";
	        mot1.cpf = "123455";
	        
	        Veiculo caminhao = new Veiculo();
	        caminhao.modelo = "Volvo FH";
	        caminhao.capacidadeCarga = 15000.0;
	        caminhao.condutor = mot1;
	 
	        rota.calcularCustoViagem(caminhao);
	        rota.iniciarViagem(caminhao, carga, mot1);
	        rota.gerarManifesto(caminhao, carga, mot1);
	        
	 }
}
