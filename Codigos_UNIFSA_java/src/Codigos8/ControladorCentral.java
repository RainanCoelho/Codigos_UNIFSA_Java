package Codigos8;

public class ControladorCentral {
	
	public void verificarPrioridade(SensorPassagem sensor, Veiculo veiculo, Via via) {
		
		if (sensor.estaAtivado && veiculo.tipo.equals("Ambulancia") && via.semaforo.cor.equals("Vermelho")) {
			via.semaforo.trocar();
			System.out.println("Prioridade detectada para "+veiculo.placa+" na "+via.nome+". Sinal alterado para verde");
		
		}
				
	}
}
