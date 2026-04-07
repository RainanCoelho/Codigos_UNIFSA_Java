package Projeto;

public class ProfessorTemporario extends Professor {

	int duracaoContrato;
	
	public ProfessorTemporario(String nome, String matriculaFuncional,double salario,int duracaoContrato) {
		super(nome,matriculaFuncional,salario);
		this.duracaoContrato = duracaoContrato;
	}

	public void aumentarSalario(double valor) {
		super.aumentarSalario(valor);
		if (duracaoContrato > 0) {
		if (valor < 0) {
			System.out.println("Valor inválido para aumento");
		}else {
			setSalario(getSalario() + valor);
		}
	
		}else {
			System.out.println("Contrato finalizado, pedido de aumento negado");
		}
		}

}
