
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		System.out.println(conta.getNumeroDaConta());
		
		Cliente luan = new Cliente();
		luan.setNome("Luan Barbosa");
		
		conta.setTitular(luan);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissão("Programador");
	}
}
