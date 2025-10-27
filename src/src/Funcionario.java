package src;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		 if (nome != null && !nome.isBlank()) {
			 this.nome = nome;
		 }
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if(salario >= 0) {
			this.salario = salario;
		}
	}
	
	public void aumentarSalario(double percentual) {
		if(percentual >= 0 && percentual != 0) {
			salario += (salario * (percentual/100));
		}
	}
	public void exibir() {
		 System.out.printf("\nO Nome é: %s e seu salário é: %.2f", nome, salario);
	}
}
