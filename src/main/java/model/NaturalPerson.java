package model;

public class NaturalPerson extends Client{
	private String cpf;
	
	public NaturalPerson(String name, long id, String cpf) {
		super(name, id);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
