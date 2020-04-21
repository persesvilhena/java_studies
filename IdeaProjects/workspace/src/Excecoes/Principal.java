package Excecoes;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setNumero("123");
		c1.setSaldo(1000);

		Conta c2 = new Conta();
		c2.setNumero("123");
		c2.setSaldo(500);

		Cadastro cad = new Cadastro();
		cad.add(c1);
		cad.add(c2);

		try {
			cad.debitar("123", 2000);
			System.out.println("OI");
		} catch (SaldoInsuficienteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage()+ e.getConta().getSaldo());
			e.printStackTrace();
		} catch (ContaInexistenteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		} finally{
			JOptionPane.showMessageDialog(null, "Finalizou");
		}
	}
}
