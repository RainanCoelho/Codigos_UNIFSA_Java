package Codigos9;

public class Fornecedor {

	String nomeEmpresa;
	int tempoEntregaDias;
	
	
	
	public Fornecedor(String nomeEmpresa,int tempoEntregaDias) {
		this.nomeEmpresa = nomeEmpresa;
		this.tempoEntregaDias = tempoEntregaDias;
	}
	
	public void envioUnidades() {
		System.out.println("Novas unidades serão enviadas");
	}

}
