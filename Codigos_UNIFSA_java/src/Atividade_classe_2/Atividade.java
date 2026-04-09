package Atividade_classe_2;

public class Atividade {

}
//----------------------------------------------------------------------------------------------------------------------------------------------
	class Produto{
	
	
	protected String nome;
	protected double preco;
	protected int estoque;
	
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
		if (this.preco<=0) {
			System.out.println("Valor inválido para preço");
		}
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
		if (this.estoque<=0) {
			System.out.println("Valor inválido para preço");
		}
	}
	
	
	public void adicionarEstoque(int qtd) {
		estoque += qtd;		
	}
	
	public void vender(int qtd) {
		estoque-=qtd;
		System.out.println("Vendido: "+qtd+" unidade(s)");
		if (qtd <= 0) {
			System.out.println("Valor inválido para ser adicionado");
		}else {
			System.out.println("Valor adicionado");
			System.out.println("Quantidade em estoque: "+estoque);
		}
	
	}
}
	//------------------------------------SUBCLASSE----------------------------------
	
	 class Perecivel extends Produto {
		
		private String dataValidade;

		
		public String getDataValidade() {
			return dataValidade;
		}

		public void setDataValidade(String dataValidade) {
			this.dataValidade = dataValidade;
		}

		public Perecivel(String nome, double preco, int estoque, String dataValidade) {
			super(nome,preco,estoque);
			this.dataValidade = dataValidade;
		}

		@Override
		public void vender(int qtd) {
				super.vender(qtd);
				System.out.println("Verificando validade... ");
				if (estoque>0) {
					System.out.println("Item perecível vendido.");
				}
			}
		}
	
//-------------------------------------Subclasse2---------------------
	
	 class ProdutoImportado extends Produto{

		private float taxaImportacao;
		
		public ProdutoImportado(String nome, double preco, int estoque,float taxaImportacao) {
			super(nome, preco, estoque);
			this.taxaImportacao = taxaImportacao;
		}

		public double getTaxaImportacao() {
			return taxaImportacao;
		}

		public void setTaxaImportacao(float taxaImportacao) {
			this.taxaImportacao = taxaImportacao;
		}
		
		@Override
		public void vender(int qtd) {
			preco += qtd;
			if(qtd<=0) {
				System.out.println("Valor inválido para taxa");
			}	
			System.out.println("Valor da taxa: "+qtd);
			
		}
	}
//---------------------------Subclasse3-------------------------
		 class Venda{
			
		Produto produto;	
		Perecivel perecivel;
		ProdutoImportado produtoImportado;
		
		public void processarItem(Produto produto,int qtd) {
			double calcularPreco = produto.preco * qtd;
			System.out.println("Preço calculado: "+calcularPreco);
		}
			

		public void processarItem(Perecivel perecivel,int qtd) {
			double calcularPreco = perecivel.preco * qtd;
			System.out.println("Preço calculado: "+calcularPreco);
		}
		

		public void processarItem(ProdutoImportado produtoImportado,int qtd) {
			double calcularPreco = produtoImportado.preco * qtd;
			System.out.println("Preço calculado: "+calcularPreco);
		}
		
		public double vender(Produto produto,int qtd) {
			double quantidade_final = produto.estoque - qtd;
			return quantidade_final;
		}
		
		public double vender(Perecivel perecivel,int qtd) {
			double quantidade_final = perecivel.estoque - qtd;
			return quantidade_final;
		}
		
		public double vender(ProdutoImportado produtoImportado,int qtd) {
			double quantidade_final = produtoImportado.estoque - qtd;
			return quantidade_final;
		}
		
}
	
//----------------------Main--------------------------
	 class SuperMercado{
			 
			public static void main(String[]args) {
				
				Produto produto = new Produto("Sabonete",7.00,20);
				Perecivel perecivel = new Perecivel("Leite",15.00,70,"16-09-2026");
				ProdutoImportado importado = new ProdutoImportado("Perfume",70.00,7,50);
				Venda venda = new Venda();
				venda.vender(perecivel, 10);
				venda.vender(produto, 10);
				venda.vender(importado, 10);
				
				
				
			} 
			 
			 
			 
			 
 }
	
	
	
	

