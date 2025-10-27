package src;

public class Pessoa {
	
	private String nome;
	private double peso;
	private double altura;
	
	public Pessoa(String nome, double altura, double peso) {
		setNome(nome);
		setAltura(altura);
		setPeso(peso);
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if( peso > 0) {
			this.peso = peso;
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
	public void calcularIMC() {
		double imc = peso / (altura * altura);
		System.out.printf("O seu IMC é igual: %.2f\n", imc);
	}
	public void classificacaoIMC() {
		double imc = peso / (altura * altura);
		if(imc < 18.5) {
			System.out.printf("Você está magro!");
		}
			else if(imc > 18.5 && imc < 24.9) {
				System.out.printf("Você está normal! ");
			}
				else if(imc > 25 && imc < 29) {
					System.out.printf("Você está com sobrepeso! ");
				}
					else {
						System.out.printf("Você está obeso! ");
					}
	}
}
