package Associacao;

public class Fornecedores extends Pessoa {

	public String nome_fantasia;
	public String website;
	
	public Fornecedores(String ID, String nome, String logradouro, String numero, String CEP, String bairro, String cidade,
			String UF, String telefone, String CPF,String nome_fantasia,String website) {
		super(ID,nome,logradouro,numero,CEP,bairro,cidade,UF,telefone,CPF);
		this.nome_fantasia = nome_fantasia;
		this.website = website;
	}
	
	public void mostrarInformacoes() {
		super.mostrarInformacoes();
		System.out.println("Nome fantasia: "+nome_fantasia+"Website:  "+website);
  }
	
}
