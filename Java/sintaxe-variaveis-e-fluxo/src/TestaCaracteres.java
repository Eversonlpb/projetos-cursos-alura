
public class TestaCaracteres {
	public static void main(String[] args) {
		
		//char guarda um �nico caractere.
		char letra = 'a';
		System.out.println(letra);
		
		// Cada caractere corresponde a um valor na tabela unicode.
		char valor = 66;
		System.out.println(valor);
		
		//Para que o java fa�a a opera��o de dois tipos diferentes de vari�veis, � preciso usar type casting.
		valor = (char) + (valor +1);
		System.out.println(valor);
		
		String palavra = "Alura cursos online de tecnologia ";
		System.out.println(palavra);
		
		//String n�o � vari�vel do tipo, primitiva, ent�o n�o � necess�rio usar type casting que que haja a concaten��o.
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
