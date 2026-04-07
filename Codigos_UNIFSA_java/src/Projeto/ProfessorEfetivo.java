package Projeto;

public class ProfessorEfetivo extends Professor {

	public ProfessorEfetivo(String nome, String matriculaFuncional,double salario) {
		super(nome,matriculaFuncional,salario);
	}

	public void aumentarSalario(double valor) {
		super.aumentarSalario(valor);
		if (valor < 0) {
			System.out.println("Valor inválido para aumento");
		}else {
			setSalario(getSalario() + valor);
		}
		}


}
