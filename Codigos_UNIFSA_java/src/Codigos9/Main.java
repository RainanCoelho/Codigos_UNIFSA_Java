package Codigos9;

public class Main {

	public static void main(String[]args) {
		
		Produto produto = new Produto("CPU",10);
		GerenteLogistico gerente = new GerenteLogistico();
		PedidoCompra pedido = new PedidoCompra("122334","Pendente");
		Fornecedor fornecedor = new Fornecedor("Sedex",10);
		Estoque estoque = new Estoque(15,"rua x",produto,pedido,fornecedor);
		
		
		estoque.reduzirEstoque(10, produto, pedido);
		estoque.adicionarEstoque(fornecedor);
		fornecedor.envioUnidades();
	}
}
