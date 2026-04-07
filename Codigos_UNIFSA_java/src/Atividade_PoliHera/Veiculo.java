package Atividade_PoliHera;

public class Veiculo {
	
	public String placa;
    public String modelo;
    public double capacidadeCarga;
    public double autonomiaKmPorLitro;
    public boolean emManutencao;
    public Motorista condutor;
   
    
    public void concluirManutencao() {
    	emManutencao = false;
    }
    
    
}
