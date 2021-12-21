
public class TestaConversao {
	public static void main (String[] args) {
		
		double salario = 1270.50;
		// Usando um type casting "()", você informa a IDE que está ciente das consequências da alteração.
		int valor = (int) salario;
		System.out.println(valor);
		
		// Lista de algumas variáveis do tipo number:
		
		long numeroGrande = 33333333333333L;
		short valorPequeno = 2131;
		byte b = 127;
		float pontoFlutuante = 3.14F; //Florade é parecido com double.
		
	}
}
