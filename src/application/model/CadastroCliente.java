package application.model;

public class CadastroCliente {
	private static int  codcli  ;
	private String nome_cli  ;
	private String cpf;
	private String datanasc ;
	private String senha ;
	private String consenha ;
	private String email_cli ;
	private String telefone_cli ;
	private String  cep_cli;
	private String logradou_cli ;
	private int num_cli ;
	private String complemento_cli  ;
	private String bairro_cli ;
	private String cidade_cli ;
	private String estado_cli ;
	private String Ponto_cli ;
	
		
	public int getCodcli() {
		return codcli;
	}
	@SuppressWarnings("static-access")
	public void setCodcli(int codcli) {
		this.codcli = codcli;
	}
	public String getNome_cli() {
		return nome_cli;
	}
	public void setNome_cli(String nome_cli) {
		this.nome_cli = nome_cli;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConsenha() {
		return consenha;
	}
	public void setConsenha(String consenha) {
		this.consenha = consenha;
	}
	public String getEmail_cli() {
		return email_cli;
	}
	public void setEmail_cli(String email_cli) {
		this.email_cli = email_cli;
	}
	public String getTelefone_cli() {
		return telefone_cli;
	}
	public void setTelefone_cli(String telefone_cli) {
		this.telefone_cli = telefone_cli;
	}
	public String getCep_cli() {
		return cep_cli;
	}
	public void setCep_cli(String cep_cli) {
		this.cep_cli = cep_cli;
	}
	public String getLogradou_cli() {
		return logradou_cli;
	}
	public void setLogradou_cli(String logradou_cli) {
		this.logradou_cli = logradou_cli;
	}
	public int getNum_cli() {
		return num_cli;
	}
	public void setNum_cli(int num_cli) {
		this.num_cli = num_cli;
	}
	public String getComplemento_cli() {
		return complemento_cli;
	}
	public void setComplemento_cli(String complemento_cli) {
		this.complemento_cli = complemento_cli;
	}
	public String getBairro_cli() {
		return bairro_cli;
	}
	public void setBairro_cli(String bairro_cli) {
		this.bairro_cli = bairro_cli;
	}
	public String getCidade_cli() {
		return cidade_cli;
	}
	public void setCidade_cli(String cidade_cli) {
		this.cidade_cli = cidade_cli;
	}
	public String getEstado_cli() {
		return estado_cli;
	}
	public void setEstado_cli(String estado_cli) {
		this.estado_cli = estado_cli;
	}
	public String getPonto_cli() {
		return Ponto_cli;
	}
	public void setPonto_cli(String ponto_cli) {
		Ponto_cli = ponto_cli;
	}
	@Override
	public String toString() {
		return "CadastroCliente [codcli=" + codcli + ", nome_cli=" + nome_cli + ", datanasc=" + datanasc + ", senha="
				+ senha + ", consenha=" + consenha + ", email_cli=" + email_cli + ", telefone_cli=" + telefone_cli
				+ ", cep_cli=" + cep_cli + ", logradou_cli=" + logradou_cli + ", num_cli=" + num_cli
				+ ", complemento_cli=" + complemento_cli + ", bairro_cli=" + bairro_cli + ", cidade_cli=" + cidade_cli
				+ ", estado_cli=" + estado_cli + ", Ponto_cli=" + Ponto_cli + "]";
	}
	
}
