
public class Conta {
	
		 double saldo;
		 int agencia = 42;
		 int numeroDaConta;
		 String titular;
		 
		 public void deposita (double valor) {
			 this.saldo += valor;
		 }
		 public boolean saca (double valor) {
			 if(this.saldo >= valor) {
				 this.saldo -= valor; 
				 System.out.println("Voc� sacou " + valor);
				 return true;
			 } else {
				 System.out.println("Seu saldo � insuficiente...");
				 return false;				 
			 }
		 }
}
