package Codigos7;

public class ContaBancaria {

	double saldo;
	double saque;
	
	public void sacar(double saque) {
		if (saque <= saldo) {
			saldo -= saque;
			System.out.println("Saque efetuado");
			System.out.println("O seu saldo é de: "+saldo);
		}else if(saque > saldo) {
			System.out.println("Você não possui saldo suficiente "
					+ "para essa transação, o seu saldo atual é de: "+saldo);
		}
	}
}
