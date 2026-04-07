package Atividade_classe_2;

public class Atividade {

	protected String nome;
	protected double preco;
	protected int estoque;
	
	public Atividade(String nome, double preco, int estoque) {
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
	
	 class Perecivel extends Atividade {
		
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
	
	 class ProdutoImportado extends Atividade{

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
			
		Atividade atividade;	
		Perecivel perecivel;
		ProdutoImportado produtoImportado;
		
		public void processarItem(Atividade atividade,int qtd) {
			double calcularPreco = atividade.preco * qtd;
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
		
		
		
}
	
//----------------------Main--------------------------
	 class SuperMercado{
			 
			public static void main(String[]args) {
				
				Atividade p1 = new Atividade();
				Perecivel perecivel = new Perecivel();
				ProdutoImportado importado = new ProdutoImportado();
				
				
				
				
			} 
			 
			 
			 
			 
 }
	
	
	
	

