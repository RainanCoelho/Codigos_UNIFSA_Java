package Atividade_POO_4;

public class Imovel_recem_construido extends Imovel {

	double valor_adicional;
	
	public Imovel_recem_construido(String endereço, double valor_venda, double valor_adicional) {
		super(endereço, valor_venda);
		this.valor_adicional = valor_adicional;
	}

	@Override
	public double valor_imovel() {
		return super.valor_imovel() + valor_adicional;
	
	}
}
