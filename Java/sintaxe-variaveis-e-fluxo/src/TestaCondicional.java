
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade, parab�ns!");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o � maior de idade, mas est� acompanhado. Pode entrar!");
			} else
			System.out.println("Infelizmente voc� n�o pode entrar...");
		}
	}
}
