
public class TestaCaracteres {
	public static void main(String[] args) {
		
		//char guarda um único caractere.
		char letra = 'a';
		System.out.println(letra);
		
		// Cada caractere corresponde a um valor na tabela unicode.
		char valor = 66;
		System.out.println(valor);
		
		//Para que o java faça a operação de dois tipos diferentes de variáveis, é preciso usar type casting.
		valor = (char) + (valor +1);
		System.out.println(valor);
		
		String palavra = "Alura cursos online de tecnologia ";
		System.out.println(palavra);
		
		//String não é variável do tipo, primitiva, então não é necessário usar type casting que que haja a concatenção.
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
