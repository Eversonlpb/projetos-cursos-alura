
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		Conta conta2 = new Conta(1337, 19468);
		Conta conta3 = new Conta(2445, 53268);
		
		System.out.println(Conta.getTotal());
	
	}
}
