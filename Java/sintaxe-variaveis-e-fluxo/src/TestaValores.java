
public class TestaValores {
	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//Segundo ser� 5, pois segundo est� guardando valor e n�o uma refer�ncia ao primeiro.
		System.out.println(segundo);
	}
}
