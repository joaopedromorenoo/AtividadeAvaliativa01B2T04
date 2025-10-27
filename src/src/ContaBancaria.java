package src;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		 setTitular(titular);
	     setSaldo(saldo);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		 if (titular != null && !titular.isBlank()) {
	            this.titular = titular;
		 }
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		 if (saldo > 0) {
	            this.saldo = saldo;
	     }
	}
	
	public void Depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
	}
	
	public void Sacar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
		}
	
	}
}
