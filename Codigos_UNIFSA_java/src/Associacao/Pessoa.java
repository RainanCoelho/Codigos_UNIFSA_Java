package Associacao;

public class Pessoa {

	public String ID;
	public String nome;
	public String logradouro;
	public String numero;
	public String CEP;
	public String bairro;
	public String cidade;
	public String UF;
	public String telefone;
	public String CPF;
	

	public Pessoa(String ID, String nome, String logradouro, String numero, String CEP, String bairro, String cidade,
			String UF, String telefone, String CPF) {
		this.ID = ID;
		this.nome = nome;
		this.logradouro = logradouro;
		this.numero = numero;
		this.CEP = CEP;
		this.bairro = bairro;
		this.cidade = cidade;
		this.UF = UF;
		this.telefone = telefone;
		this.CPF = CPF;
	}
	
	public void mostrarInformacoes() {
		System.out.println("ID: "+ID+"nome: "+nome+
				"logradouro: "+logradouro+"número: "+numero+"CEP: "+"bairro: "+bairro+"cidade"+cidade+"UF"+UF+"telefone"+telefone+"CPF"+CPF);
	}
	
	
}
