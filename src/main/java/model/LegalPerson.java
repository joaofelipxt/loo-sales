package model;

public class LegalPerson extends Client {
	private String cnpj;
	
	public LegalPerson(String name, long id, String cnpj) {
		super(name, id);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
