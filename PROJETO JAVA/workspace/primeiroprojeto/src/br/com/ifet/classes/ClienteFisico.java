package br.com.ifet.classes;

import javax.swing.JOptionPane;

public class ClienteFisico extends Cliente{
	private String cpf;
	private String rg;
	private String nomepai;
	
	public ClienteFisico(String nome, String sobrenome, String rua, int numero,
			String bairro, String cidade, String estado, String cel,
			String email, String cpf, String rg, String nomepai){
		super(nome,sobrenome,rua,numero,bairro,cidade,estado,cel,email);
		this.cpf = cpf;
		this.rg = rg;
		this.nomepai = nomepai;
		
	}
	public ClienteFisico(){
		super();
	}
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public String getRg(){
		return rg;
	}
	public void setRg(String r){
		this.rg = r;
	}
	public String getNomepai(){
		return nomepai;
	}
	public void setNomepai(String nomepai){
		this.nomepai = nomepai;
	}
	public void imprime(){
		String dados = "Nome: "+getNome()+"\nSobrenome: "+getSobrenome()+"\nRua: "
		+getRua()+"\nNumero: "+getNumero()+"\nBairro: "+getBairro()+"\nCidade: "+getCidade()+
		"\nEstado: "+getEstado()+"\nCelular: "+getCel()+"\nE-mail: "+getEmail()+"\nCpf: "+getCpf()+
		"\nRg: "+getRg()+"\nNomepai: "+getNomepai();
		JOptionPane.showMessageDialog(null, dados);
		System.out.println("Nome: "+ getNome());
		System.out.println("Sobrenome: "+ getSobrenome());
		System.out.println("Rua: "+ getRua());
		System.out.println("Numero: "+ getNumero());
		System.out.println("Bairro: "+ getBairro());
		System.out.println("Cidade: "+ getCidade());
		System.out.println("Estado: "+ getEstado());
		System.out.println("Cel: "+ getCel());
		System.out.println("E-mail: "+ getEmail());
		System.out.println("CPF: "+ getCpf());
		System.out.println("Rg: "+ getRg());
		System.out.println("Nome pai: "+ getNomepai());
	}

}
