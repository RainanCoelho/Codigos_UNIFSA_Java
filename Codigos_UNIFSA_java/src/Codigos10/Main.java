package Codigos10;

public class Main {

	public static void main(String[]args) {
		
		Compra compra = new Compra(100);
		Cliente cliente = new Cliente(true);
		Cupom cupom = new Cupom("CONSUMIDOR20");
		Processador_de_Vendas processador = new Processador_de_Vendas(0,compra,cliente,cupom);
	
		processador.processar_venda(0, compra, cliente, cupom);
		processador.processar_venda(2, compra, cliente, cupom);
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
