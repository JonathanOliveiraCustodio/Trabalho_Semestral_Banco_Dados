package application.model;

public class CadastroParceiro {
	private String nome ;
	private String cnpj ;
	private String social ;
	private String nomefant ;
	private String logradouro ;
	private String cep ;
	private String complemento ;
	private String telefone ;
	private String email ;
	private String senha ;
	private String confemail ;
	private String cofsenha ;
	private static int codparc ;
	private String dataAbert ;
	private int num ;
	private String bairro ;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public String getNomefant() {
		return nomefant;
	}
	public void setNomefant(String nomefant) {
		this.nomefant = nomefant;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfemail() {
		return confemail;
	}
	public void setConfemail(String confemail) {
		this.confemail = confemail;
	}
	public String getCofsenha() {
		return cofsenha;
	}
	public void setCofsenha(String cofsenha) {
		this.cofsenha = cofsenha;
	}
	public int getCodparc() {
		return codparc;
	}
	@SuppressWarnings("static-access")
	public void setCodparc(int codparc) {
		this.codparc = codparc;
	}
	public String getDataAbert() {
		return dataAbert;
	}
	public void setDataAbert(String dataAbert) {
		this.dataAbert = dataAbert;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "CadastroParceiro [nome=" + nome + ", cnpj=" + cnpj + ", social=" + social + ", nomefant=" + nomefant
				+ ", logradouro=" + logradouro + ", cep=" + cep + ", complemento=" + complemento + ", telefone="
				+ telefone + ", email=" + email + ", senha=" + senha + ", confemail=" + confemail + ", cofsenha="
				+ cofsenha + ", codparc=" + codparc + ", dataAbert=" + dataAbert + ", num=" + num + ", bairro=" + bairro
				+ "]";
	
}
}
