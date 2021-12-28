
public class Conta {
	
		 private double saldo;
		 int agencia = 42;
		 int numeroDaConta;
		 Cliente titular;
		 
		 public void deposita (double valor) {
			 this.saldo += valor;
		 }
		 public boolean saca (double valor) {
			 if(this.saldo >= valor) {
				 this.saldo -= valor; 
				 System.out.println("Você sacou " + valor);
				 return true;
			 } else {
				 System.out.println("Seu saldo é insuficiente...");
				 return false;				 
			 }
		 }
		 
		 public boolean transfere(double valor, Conta destino) {
			 if (this.saldo >= valor) {
				 this.saldo -= valor;
				 destino.deposita(valor);
				 System.out.println("Transferência realizada com sucesso.");
				 return true;
			 } else {
				 System.out.println("Saldo insuficiente");
				 return false;
			 }
			 
		 }
		 
		 public double getSaldo() {
			 return this.saldo;
		 }
}
