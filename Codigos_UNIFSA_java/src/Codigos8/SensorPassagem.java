package Codigos8;

public class SensorPassagem {

	int id;
	boolean estaAtivado;

	public SensorPassagem(int id) {
		this.id = id;
		this.estaAtivado = false;
	}
	
	public void detectarVeiculo() {
		estaAtivado = true;
	}

}

