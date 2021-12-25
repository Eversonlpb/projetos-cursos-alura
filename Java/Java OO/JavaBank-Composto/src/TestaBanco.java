
public class TestaBanco {
	public static void main(String[] args) {
		Cliente teste = new Cliente();
		teste.nome = "Ceborinha Reverso";
		teste.cpf = "333.333.333.33";
		teste.profissão = "Sordador";
		
		Conta contaCeborinha = new Conta();
		contaCeborinha.deposita(100);
		
		contaCeborinha.titular = teste;
		System.out.println(contaCeborinha.titular.nome);
	}
}
