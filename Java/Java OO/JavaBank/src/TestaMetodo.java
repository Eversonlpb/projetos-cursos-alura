
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaTeste = new Conta();
		contaTeste.saldo = 100;
		contaTeste.deposita(50);
		System.out.println("Seu novo saldo é " + contaTeste.saldo);
		
		boolean saque = contaTeste.saca(20);
		System.out.println("Seu novo saldo é " + contaTeste.saldo);
		System.out.println(saque);
		
		Conta contaBia = new Conta();
		contaBia.deposita(1000);
		
		contaBia.transfere(300, contaTeste);
		System.out.println(contaBia.saldo);
		System.out.println(contaTeste.saldo);
		}
	}

