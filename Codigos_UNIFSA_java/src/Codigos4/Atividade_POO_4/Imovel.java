package Atividade_POO_4;

public class Imovel {

	String endereço;
	double valor_venda;
	
	public Imovel(String endereço, double valor_venda) {
		this.endereço = endereço;
		this.valor_venda = valor_venda;
	}
	
	public double valor_imovel() {
		double valor_imovel = valor_venda;
		return valor_imovel;
	}
	
}
