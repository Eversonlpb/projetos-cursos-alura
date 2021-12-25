
public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta é " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta é " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta é " + segundaConta.saldo);
		
		System.out.println("Saldo da primeira conta é " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("As duas contas estão referênciadas ao mesmo objeto.");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
