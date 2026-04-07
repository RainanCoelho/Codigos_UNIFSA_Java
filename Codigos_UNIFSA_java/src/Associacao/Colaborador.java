package Associacao;

public class Colaborador extends Pessoa {

	public String cargo;
	public String funcao;
	
	public Colaborador(String ID, String nome, String logradouro, String numero, String CEP, String bairro, String cidade,
			String UF, String telefone, String CPF,String cargo,String funcao) {
		super(ID,nome,logradouro,numero,CEP,bairro,cidade,UF,telefone,CPF);
		this.cargo = cargo;
		this.funcao = funcao;
	}
	
	public void mostrarInformacoes() {
		super.mostrarInformacoes();
		System.out.println("Cargo: "+cargo+"Função:  "+funcao);
  }
	
}
