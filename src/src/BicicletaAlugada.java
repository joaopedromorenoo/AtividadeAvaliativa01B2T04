package src;

public class BicicletaAlugada {
	
	private int horas;
	private double valorhoras;
	
	public BicicletaAlugada(int horas, double valorhoras) {
		setHoras(horas);
		setValorhoras(valorhoras);
	}
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		if(horas >= 1) {
			this.horas = horas;
		}
	}
	public double getValorhoras() {
		return valorhoras;
	}
	public void setValorhoras(double valorhoras) {
		if(valorhoras > 0) {
			this.valorhoras = valorhoras;
		}
	}
	public void calcularValor(int horas, double valorhoras) {
		double total = valorhoras * horas;
		System.out.printf("O valor total é: " + total);
	}
	
}
