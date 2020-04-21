package br.com.ifet.classes;
//nome, sobrenome, rua, numero int, bairro, cidade, estado, cel, email
public class Cliente {
	private String nome;
	private String sobrenome;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cel;
	private String email;
	public Cliente(){
	}
	public Cliente(String nome, String sobrenome, String rua, int numero, String bairro, String cidade, String estado, String cel, String email){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cel = cel;
		this.email = email;
	}
	public void setNome(String nom){
		this.nome = nom;
	}
	public void setSobrenome(String sobrenom){
		this.sobrenome = sobrenom;
	}
	public void setRua(String ru){
		this.rua = ru;
	}
	public void setNumero(int numer){
		this.numero = numer;
	}
	public void setBairro(String bairr){
		this.bairro = bairr;
	}
	public void setCidade(String cidad){
		this.cidade = cidad;
	}
	public void setEstado(String estad){
		this.estado = estad;
	}
	public void setCel(String ce){
		this.cel = ce;
	}
	public void setEmail(String emai){
		this.email = emai;
	}
	public String getNome(){
		return this.nome;
	}
	public String getSobrenome(){
		return this.sobrenome;
	}
	public String getRua(){
		return this.rua;
	}
	public int getNumero(){
		return this.numero;
	}
	public String getBairro(){
		return this.bairro;
	}
	public String getCidade(){
		return this.cidade;
	}
	public String getEstado(){
		return this.estado;
	}
	public String getCel(){
		return this.cel;
	}
	public String getEmail(){
		return this.email;
	}


}
