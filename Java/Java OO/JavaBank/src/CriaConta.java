
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Seu saldo � " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Seu novo saldo � " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("Seu saldo � " + segundaConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numeroDaConta);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta est� na ag�ncia " + segundaConta.agencia);
	
		if(primeiraConta == segundaConta) {
			System.out.println("As duas contas est�o refer�nciadas ao mesmo objeto.");
		} else {
			System.out.println("Contas referenciadas a objetos diferentes.");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		}
}
