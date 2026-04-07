package Codigos10;

public class Processador_de_Vendas {

	int contagem;
	Compra compra;
	Cliente cliente;
	Cupom cupom;

	public Processador_de_Vendas(int contagem,Compra compra, Cliente cliente, Cupom cupom) {
		this.contagem = contagem;
		this.compra = compra;
		this.cliente = cliente;
		this.cupom = cupom;
	}
	
	
	public void processar_venda(int contagem,Compra compra,Cliente cliente,Cupom cupom){
		contagem += 1;
		if(cliente.VIP == true) {
			if ((cupom.nome.equals("CONSUMIDOR20"))&&(contagem<=1)) {
				int valor_final = compra.valor_total_bruto - 20;
				System.out.println("Cupom aplicado!!");
				System.out.println("O cupom "+cupom.nome+
						" foi aplicado a sua compra, agora o seu valor é de: "+valor_final);
	
			}else {
				int valor_final = (compra.valor_total_bruto * 19)/20;
				System.out.println("O cupom já foi utilizado uma vez!!, "
						+ "mas já que você é vip o valor de sua compra fica de: "
						+ ""+valor_final);
			}
		  }
		}
		
	}

