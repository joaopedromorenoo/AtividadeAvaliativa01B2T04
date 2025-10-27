package src;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		setAltura(altura);
		setLargura(largura);
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if(largura > 0) {
			this.largura = largura;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
	}
	
	public void Area(double largura, double altura) {
		double area = largura * altura;
		 System.out.printf("\nA area é: %.2f", area);
	}
	
	public void Perimetro(double largura, double altura) {
		double perimetro = 2 * (altura + largura);
		System.out.printf("\nA area é: %.2f", perimetro);
	}
}
