
public class Conta {
	
		 private double saldo;
		 private int agencia = 42;
		 private int numeroDaConta;
		 private Cliente titular;
		 
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
		 
		 public int getNumeroDaConta() {
			 return this.numeroDaConta;
		 }
		 
		 public void setNumeroDaConta(int numeroDaConta) {
			 this.numeroDaConta = numeroDaConta;
		 }
		 
		 public int getAgencia() {
			 return this.agencia;
		 }
		 
		 public void setAgencia(int novaAgencia) {
			 this.agencia = novaAgencia;
		 }
		 
		 public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		 
		 public Cliente getTitular() {
			return titular;
		}
}
