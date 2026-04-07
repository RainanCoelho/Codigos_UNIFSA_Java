package Associacao;

public class Associados extends Pessoa {

	public String situacao;
	public String numero_de_associado;
	
	public Associados(String ID, String nome, String logradouro, String numero, String CEP, String bairro, String cidade,
			String UF, String telefone, String CPF,String situacao,String numero_de_associado) {
		super(ID,nome,logradouro,numero,CEP,bairro,cidade,UF,telefone,CPF);
		this.situacao = situacao;
		this.numero_de_associado = numero_de_associado;
	}
	
	public void mostrarInformacoes() {
		super.mostrarInformacoes();
		System.out.println("Situação: "+situacao+"Número de Associado "+numero_de_associado);
  }
}
