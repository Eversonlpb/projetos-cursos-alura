
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		
		double salario;
		salario = 1270.50;
		System.out.println("O sal�rio � " + salario + ", parab�ns!");
		
		//Um inteiro cabe num double.
		double idade = 37;
		
		// � poss�vel fazer opera��es aritm�ticas usando o double.
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		// Quando faz opera��es usando n�meros inteiros, ele ir� dar um resultado inteiro.
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		// Para que o resultado seja um double � necess�rio que um dos n�meros seja em ponto flutuante..
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa);
	}
}
