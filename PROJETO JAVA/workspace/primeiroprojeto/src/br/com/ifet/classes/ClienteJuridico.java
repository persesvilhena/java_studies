package br.com.ifet.classes;

public class ClienteJuridico extends Cliente{
	public String cnpj;
	public String ie;
	public ClienteJuridico(String nome, String sobrenome, String rua, int numero, String bairro, String cidade, String estado, String cel, String email, String cnpj, String ie){
		super(nome,sobrenome,rua,numero,bairro,cidade,estado,cel,email);
		this.cnpj = cnpj;
		this.ie = ie;
	}
	public ClienteJuridico(){
		super();
	}
	public String getCnpj(){
		return cnpj;
	}
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	public String getIe(){
		return ie;
	}
	public void setIe(String ie){
		this.ie = ie;
	}
	public void imprimir(){
		System.out.println("Nome: "+ getNome());
		System.out.println("Sobrenome: "+ getSobrenome());
		System.out.println("Rua: "+ getRua());
		System.out.println("Número: "+ getNumero());
		System.out.println("Bairro: "+ getBairro());
		System.out.println("Cidade: "+ getCidade());
		System.out.println("Estado: "+ getEstado());
		System.out.println("CEL: "+ getCel());
		System.out.println("E-mail: "+ getEmail());
		System.out.println("CNPJ: "+ getNome());
		System.out.println("Inscrição Estadual: "+ getIe());
	}

}
