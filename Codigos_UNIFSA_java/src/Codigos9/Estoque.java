package Codigos9;

public class Estoque {
	
	int quantidadeAtual;
	String localizacaoCorretor;
	
	Produto produto;
	PedidoCompra pedido;
	Fornecedor fornecedor;
	
	public Estoque(int quantidadeAtual,String localizacaoCorretor,
			Produto produto,PedidoCompra pedido,Fornecedor fornecedor) {
		this.quantidadeAtual = quantidadeAtual;
		this.pedido = pedido;
		this.localizacaoCorretor = localizacaoCorretor;
		this.fornecedor = fornecedor;
		this.produto = produto;
		
	}
	
	public void reduzirEstoque(int qtd,Produto produto,PedidoCompra pedido) {
		quantidadeAtual -= qtd;
		if (quantidadeAtual <= produto.PontoCritico) {		
			System.out.println("Iniciando Protocolo de reposição!!");
			pedido.status = "Enviado";
		}
	}
	
	public void adicionarEstoque(Fornecedor fornecedor) {
		System.out.println("Estoque Crítico detectado para "+produto.nome+
				". Gerando Pedido de Compra com o fornecedor: "
				+fornecedor.nomeEmpresa+". Status: "+pedido.status);
	}

}
