
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaBia = new Conta();
		System.out.println(contaBia);
		
		contaBia.titular = new Cliente();
		contaBia.titular.nome = "Bianca";
		System.out.println(contaBia.titular.nome);
	}
}
