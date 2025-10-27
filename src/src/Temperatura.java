package src;

public class Temperatura {
	
	private double celsius;
	
	public Temperatura(double celsius) {
		setCelsius(celsius);
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		if(celsius > -273.15) {
			this.celsius = celsius;
		}
	}
	
	public void mudaFahrenheit() {
		double fahrenheit = celsius * 9 / 5 + 32;
		System.out.println("Temperatura em fahrenheit: " + fahrenheit);
	}
	
	public void mudaKelvin() {
		double kelvin = celsius + 273.15;
		System.out.println("Temperatura em kelvin: " + kelvin);
	}
}
