
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		
		double salario;
		salario = 1270.50;
		System.out.println("O salário é " + salario + ", parabéns!");
		
		//Um inteiro cabe num double.
		double idade = 37;
		
		// É possível fazer operações aritméticas usando o double.
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		// Quando faz operações usando números inteiros, ele irá dar um resultado inteiro.
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		// Para que o resultado seja um double é necessário que um dos números seja em ponto flutuante..
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa);
	}
}
