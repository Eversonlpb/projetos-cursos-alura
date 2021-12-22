
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você é maior de idade, parabéns!");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não é maior de idade, mas está acompanhado. Pode entrar!");
			} else
			System.out.println("Infelizmente você não pode entrar...");
		}
	}
}
