package Codigos8;

public class Main {

	public static void main(String[]args) {
		
		Semaforo semaforo = new Semaforo("Vermelho");
		Via via = new Via("Av. Principal",20,semaforo);
		Veiculo ambulancia = new Veiculo("ABC-1234","Ambulancia");
		SensorPassagem sensor = new SensorPassagem(1);
		ControladorCentral controlador = new ControladorCentral();
		
		sensor.detectarVeiculo();
		controlador.verificarPrioridade(sensor, ambulancia, via);
		
	
	
	}
}
