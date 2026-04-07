package AVA;

public class Viga {

	private double base;
	private double altura;
	private double comprimento;
	
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altuta) {
		this.altura = altuta;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public void calcularVolume() {
		System.out.println("Valor da base: "+base);
		System.out.println("Valor da altura: "+altura);
		System.out.println("Valor do comprimento: "+comprimento);
		double volume = base * altura* comprimento;
		System.out.println("Valor da área calculada: "+volume);

	}
	
	
}
