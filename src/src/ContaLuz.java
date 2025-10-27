package src;

public class ContaLuz {
	
	private double consumoKwh;
	private double valorKwh;
	
	public ContaLuz (double consumoKwh, double valorKwh) {
		setConsumoKwh(consumoKwh);
		setValorKwh(valorKwh);
	}
	
	public double getConsumoKwh() {
		return consumoKwh;
	}
	
	public void setConsumoKwh(double consumoKwh) {
		if(consumoKwh > 0) {
			this.consumoKwh = consumoKwh;
		}
	}
	
	public double getValorKwh() {
		return valorKwh;
	}
	
	public void setValorKwh(double valorKwh) {
		if(valorKwh > 0) {
			this.valorKwh = valorKwh;
		}
	}
	
	public void calcularValorTotal(double valorKwh, double consumoKwh) {
		double valortotal = valorKwh * consumoKwh;
		System.out.println("O valor total é : " + valortotal);
	}	
}
