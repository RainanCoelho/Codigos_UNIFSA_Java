package Atividade_POO_4;

public class Imovel_antigo extends Imovel {

	double desconto;

	public Imovel_antigo(String endereço, double valor_venda,double desconto) {
		super(endereço, valor_venda);
		this.desconto = desconto;
		if ((this.desconto > 100)&&(this.desconto < 0)) {
			System.out.println("Valor inválido para desconto");
		} 
	}
	
	@Override
	public double valor_imovel() {
		return super.valor_imovel() * (desconto/100);
	}
	
}
