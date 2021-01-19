package Cliente;

public class Customer {

	protected int cpf;
	protected String nome;
	protected String email;
	protected String numero;

	/*
	 * public Customer(int cpf, String nome , String email, String numero){ this.cpf
	 * = cpf; this.nome = nome; this.email = email; this.numero = numero;
	 * 
	 * }
	 */
	public static void main(String[] args) {
		// Customer c = new Customer(123, "Thiago", "thiago.ect@hotmail.com",
		// "88345840");

	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String rename(String novoNome) {
		this.nome = novoNome;
		return nome;
	}

}
