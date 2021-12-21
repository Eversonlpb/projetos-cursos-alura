
public class TestaValores {
	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//Segundo será 5, pois segundo está guardando valor e não uma referência ao primeiro.
		System.out.println(segundo);
	}
}
