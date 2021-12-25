
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Seu saldo é " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Seu novo saldo é " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("Seu saldo é " + segundaConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numeroDaConta);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta está na agência " + segundaConta.agencia);
	
		if(primeiraConta == segundaConta) {
			System.out.println("As duas contas estão referênciadas ao mesmo objeto.");
		} else {
			System.out.println("Contas referenciadas a objetos diferentes.");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		}
}
