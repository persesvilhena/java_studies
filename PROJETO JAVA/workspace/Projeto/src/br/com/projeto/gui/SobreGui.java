package br.com.projeto.gui;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SobreGui extends JFrame {

	private JPanel jContentPane = null;
	private JLabel jlSobre = null;

	/**
	 * This is the default constructor
	 */
	public SobreGui() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(400, 300);
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("Sobre");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jlSobre = new JLabel();
			jlSobre.setBounds(new java.awt.Rectangle(114,35,147,177));
			jlSobre.setToolTipText("");
			jlSobre.setText("<html><center>Projeto de java<br>Aluno: Perses De Vilhena<br>Professor: Rodrigo</center></html>");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jlSobre, null);
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
