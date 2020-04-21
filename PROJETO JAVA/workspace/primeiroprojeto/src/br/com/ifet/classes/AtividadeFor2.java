package br.com.ifet.classes;

public class AtividadeFor2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i < 10){
			
			int x = 0;
			while(x < 10){
				
				int y = 0;
				while(y < 10){
					
					
					System.out.print("Valor: " + i);
					System.out.print(x);
					System.out.println(y);
					y++;
				}
				x++;
			}
			i++;
		}
			

	}

}