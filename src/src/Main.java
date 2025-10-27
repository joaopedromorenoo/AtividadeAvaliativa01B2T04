package src;

public class Main {



	public static void main(String[] args) {
		
		ContaBancaria();
		Filme();
		Funcionario();
		Retangulo();
		Musica();
		Pessoa();
		ContaLuz();
		AluguelBicicleta();
		ProdutoEstoque();
		Temperatura();
		
	}
	
	public static void ContaBancaria() {
	 	ContaBancaria conta = new ContaBancaria("João", 100);
		conta.Depositar(200);
		conta.Sacar(100);
		System.out.printf("_________Exercicio 1__________\n\n");
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
	}
	
	public static void Filme() {
		
		Filme Filme1 = new Filme("Eu sou a Lenda", 3.5);
		Filme Filme2 = new Filme("One Piece", 5.0);
		
		System.out.printf("\n_________Exercicio 2__________\n");
		
		Filme1.exibir();
		Filme2.exibir();
		System.out.printf("\n");
	}
	
	public static void Funcionario() {
		
		Funcionario funcionario1 = new Funcionario("João", 10000);

		System.out.printf("\n_________Exercicio 3__________\n");
		
		funcionario1.exibir();
		funcionario1.aumentarSalario(10);
		funcionario1.exibir();
		System.out.printf("\n");
	}
	
	public static void Retangulo() {
		
		Retangulo retangulo = new Retangulo(0.0,0.0);
		
		System.out.printf("\n_________Exercicio 4__________\n");
		
		retangulo.Area(10, 10);
		retangulo.Perimetro(10,10);
		System.out.printf("\n");
		
	}
	
	public static void Musica() {
		
		Musica musica = new Musica("Gimme That", 183);
		Musica musica2 = new Musica("Run it", 189);
		
		System.out.printf("\n_________Exercicio 5__________\n\n");
		
		musica.formatarDuracao();
		System.out.printf("\n");
		musica2.formatarDuracao();
		System.out.printf("\n");
	}
	
	public static void Pessoa() {
		
		Pessoa pessoa = new Pessoa("João", 1.70, 70);
		
		System.out.printf("\n_________Exercicio 6__________\n\n");
		
		pessoa.calcularIMC();
		pessoa.classificacaoIMC();
		System.out.printf("\n");
		
	}
	
	public static void ContaLuz() {
		
		ContaLuz contaluz = new ContaLuz(0,0);
		
		System.out.printf("\n_________Exercicio 7__________\n\n");
		
		contaluz.calcularValorTotal(20, 20);
		System.out.printf("\n");
	}
	
	public static void AluguelBicicleta() {
		
		BicicletaAlugada bicicletaAlugada = new BicicletaAlugada(0,0);
		
		System.out.printf("_________Exercicio 8__________\n\n");

		bicicletaAlugada.calcularValor(10,10);
		
		System.out.printf("\n");
	}
	
	public static void ProdutoEstoque() {
		
		ProdutoEstoque produtoestocado = new ProdutoEstoque("banana", 10);
		
		System.out.printf("\n_________Exercicio 9__________\n\n");
		
		produtoestocado.adicionarEstoque(100);
		produtoestocado.removerEstoque(10);
		System.out.printf("\n");
		
	}
	
	public static void Temperatura() {
		
		Temperatura temperatura = new Temperatura(50);
		
		System.out.printf("_________Exercicio 10__________\n\n");
		
		temperatura.mudaFahrenheit();
		temperatura.mudaKelvin();
	}
	
}
