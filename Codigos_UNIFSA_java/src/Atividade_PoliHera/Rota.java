package Atividade_PoliHera;

public class Rota {

	 public String origem;
	    public String destino;
	    public double distanciaKm;
	    public double precoCombustivel;

	    Veiculo veiculo;
	    Carga carga;
	    Motorista motorista;
	    
	    public void iniciarViagem(Veiculo veiculo, Carga carga, Motorista motorista) {
	        System.out.println("--- Iniciando Verificação de Viagem ---");

	        if ((motorista.nome != null)&&(motorista.cnh != null)&&(motorista.cpf != null)) {
	    		System.out.println("Motorista válido para dirigir!!");
	    	}else {
	    		System.out.println("Motorista inválido para dirigir!!");
	    	}
	        
	        
	        
	        
	        	if (carga.peso > veiculo.capacidadeCarga) {
	        		System.out.println("Viagem não autorizada, carga excedente");
	        	}else if(veiculo.emManutencao == true) {
	        		System.out.println("Viagem não autorizada, veículo em manutenção!!");
	        	}else if((carga.peso < veiculo.capacidadeCarga)&&(veiculo.emManutencao == false)) {
	        		System.out.println("Viagem não autorizada");
	        	}
	        
	        	
	    }
	    double calcularCustoViagem(Veiculo veiculo) {
	    	double custo = (distanciaKm/veiculo.autonomiaKmPorLitro) * precoCombustivel;
	    	return custo;
	    }
	    
	    public void gerarManifesto(Veiculo veiculo, Carga carga, Motorista motorista) {
	        System.out.println("\n========== MANIFESTO DE CARGA ==========");
	        System.out.println("O motorista "+motorista.nome+" partiu de "+origem+" com o veículo "+veiculo.placa+" ,carregando "
	        +carga.peso+"kg de "+carga.descricao+" com custo estimado de R$"+precoCombustivel+" de valor");
	    }
}
