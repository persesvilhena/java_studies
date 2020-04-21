package br.com.ifet.classes;

public class SubClasse extends SuperClasse{
	public String str2 = "SubClasse";
	public static void main(String[] args) {
		SubClasse sc= new SubClasse ();
		System.out.println("Propriedade herdada:" + sc.str);
		System.out.println("Propriedade Local" + sc.str2);
	}
}
