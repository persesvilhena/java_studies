package Empregado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado e1 = new PorComissao("Coquinho maluko", 250, 10, 3);
		System.out.println(e1.toString());
		
		
		Empregado e2 = new PorHora("coco2", 10, 20);
		System.out.println(e2.toString());
		
		Empregado e3 = new PorItem("vinicao", 15, 20);
		System.out.println(e3.toString());
		
		Empregado e4 = new Chefe("Perses", 250000);
		System.out.println(e4.toString());

	}

}
