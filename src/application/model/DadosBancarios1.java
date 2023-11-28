package application.model;

public class DadosBancarios1 {
	private CadastroParceiro parceiro;
	private int cod; 
	private String banco ;
	 private String agencia ;
	 private String numconta ;
	 private String tipodeconta ;
	 private String nometitular ;
	 private String cnpj ;
	 private float valorTotal;
	 
	


	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public CadastroParceiro getParceiro() {
		return parceiro;
	}
	public void setParceiro(CadastroParceiro parceiro) {
		this.parceiro = parceiro;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumconta() {
		return numconta;
	}
	public void setNumconta(String numconta) {
		this.numconta = numconta;
	}
	public String getTipodeconta() {
		return tipodeconta;
	}
	public void setTipodeconta(String tipodeconta) {
		this.tipodeconta = tipodeconta;
	}
	public String getNometitular() {
		return nometitular;
	}
	public void setNometitular(String nometitular) {
		this.nometitular = nometitular;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@Override
	public String toString() {
		return "DadosBancario \nbanco=" + banco + ",  agencia=" + agencia + "\n numconta=" + numconta + "tipodeconta="
				+ tipodeconta + "\n nometitular=" + nometitular + "\n cnpj=" + cnpj ;
	}



	}


