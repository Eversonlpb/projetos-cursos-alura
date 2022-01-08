
public class TestaFuncionario {
	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("99999999999");
		nico.setSalario(1000.10);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
