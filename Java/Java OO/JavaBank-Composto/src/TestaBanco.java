
public class TestaBanco {
	public static void main(String[] args) {
		Cliente teste = new Cliente();
		teste.nome = "Ceborinha Reverso";
		teste.cpf = "333.333.333.33";
		teste.profiss�o = "Sordador";
		
		Conta contaCeborinha = new Conta();
		contaCeborinha.deposita(100);
		
		//Associa contaCeborinha a teste. Faz composi��o do objeto.
		contaCeborinha.titular = teste;
		System.out.println(contaCeborinha.titular.nome);
	}
}
