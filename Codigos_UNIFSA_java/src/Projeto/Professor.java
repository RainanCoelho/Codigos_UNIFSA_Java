package Projeto;

public class Professor {

	String nome;
	String matriculaFuncional;
	private double salario;
	
	
	public Professor(String nome, String matriculaFuncional,double salario) {
		this.nome = nome;
		this.matriculaFuncional = matriculaFuncional;
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
		if (this.salario < 0) {
			System.out.println("Salário não pode ser negativo");
		}else {
			System.out.println("Salário salvo");
		}
	}
	
	public void aumentarSalario(double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido para aumento");
		}else {
			salario = salario + valor;
		}
	}
	
}
