
public class Conta {
	
		 private double saldo;
		 private int agencia;
		 private int numeroDaConta;
		 private Cliente titular;
		 private static int total;
		 
		 
		 public Conta(int agencia, int numeroDaConta) {
			 Conta.total++;
			 System.out.println("O n�mero de contas � " + Conta.total);
			 this.agencia = agencia;
			 this.numeroDaConta = numeroDaConta;
			 System.out.println("Estou criando a conta " + this.numeroDaConta + " na agencia "
			 + this.agencia);
		 }
		 
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
		 
		 public boolean transfere(double valor, Conta destino) {
			 if (this.saldo >= valor) {
				 this.saldo -= valor;
				 destino.deposita(valor);
				 System.out.println("Transfer�ncia realizada com sucesso.");
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
			 if (numeroDaConta <= 0) {
				 System.out.println("N�o s�o permitidos valores negativos.");
				 return;
			 }
			 this.numeroDaConta = numeroDaConta;
		 }
		 
		 public int getAgencia() {
			 return this.agencia;
		 }
		 
		 public void setAgencia(int novaAgencia) {
			 if(agencia <= 0) {
				 System.out.println("N�o s�o permitidos valores negativos.");
				 return;
			 }
			 this.agencia = novaAgencia;
		 }
		 
		 public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		 
		 public Cliente getTitular() {
			return titular;
		}
		 
		 public static int getTotal() {
			 return Conta.total;
		 }
}
