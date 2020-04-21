package br.com.ifet.classes;

public class VerVogal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0){
			System.out.println("Insira valores no vetor args");
			System.exit(1);
		}
		char c = args[0].charAt(0);
		switch(c){
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(c + " é uma vogal.");
			break;
		case 'y':
		case 'Y':
		case 'w':
		case 'W':
			System.out.println(c + " pode ter som de vogal.");
			break;
		default:
			System.out.println(c + " não é uma vogal.");
		}

	}

}
