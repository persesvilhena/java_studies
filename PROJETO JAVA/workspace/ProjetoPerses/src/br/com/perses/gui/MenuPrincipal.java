package br.com.perses.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class MenuPrincipal extends JFrame {

	private JPanel jContentPane = null;
	private JMenuBar JMenuPrincipal = null;
	private JMenu JMenuCadastro = null;
	private JMenu JMenuVendas = null;
	private JMenu JMenuRelatorios = null;
	private JMenu JMenuSobre = null;
	private JMenu JMenuSair = null;
	private JMenuItem ItemClientes = null;
	private JMenuItem ItemFuncionarios = null;
	private JMenuItem ItemProdutos = null;
	private JMenuItem ItemUsuarios = null;
	private JMenuItem ItemVendas = null;
	private JMenuItem ItemRelVendas = null;
	private JMenuItem ItemRelClientes = null;
	private JMenuItem ItemRelProdutos = null;
	private JMenuItem ItemRelFuncionarios = null;
	private JMenuItem ItemRelUsuarios = null;
	private JMenuItem ItemSobre = null;
	private JMenuItem ItemSair = null;
	/**
	 * This method initializes JMenuPrincipal	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJMenuPrincipal() {
		if (JMenuPrincipal == null) {
			JMenuPrincipal = new JMenuBar();
			JMenuPrincipal.add(getJMenuCadastro());
			JMenuPrincipal.add(getJMenuVendas());
			JMenuPrincipal.add(getJMenuRelatorios());
			JMenuPrincipal.add(getJMenuSobre());
			JMenuPrincipal.add(getJMenuSair());
		}
		return JMenuPrincipal;
	}

	/**
	 * This method initializes JMenuCadastro	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuCadastro() {
		if (JMenuCadastro == null) {
			JMenuCadastro = new JMenu();
			JMenuCadastro.setText("Cadastro");
			JMenuCadastro.setIcon(new ImageIcon(getClass().getResource("/br/com/projeto/imagens/A.png")));
			JMenuCadastro.add(getItemClientes());
			JMenuCadastro.add(getItemFuncionarios());
			JMenuCadastro.add(getItemProdutos());
			JMenuCadastro.add(getItemUsuarios());
		}
		return JMenuCadastro;
	}

	/**
	 * This method initializes JMenuVendas	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuVendas() {
		if (JMenuVendas == null) {
			JMenuVendas = new JMenu();
			JMenuVendas.setText("Vendas");
			JMenuVendas.setIcon(new ImageIcon(getClass().getResource("/br/com/projeto/imagens/B.png")));
			JMenuVendas.add(getItemVendas());
		}
		return JMenuVendas;
	}

	/**
	 * This method initializes JMenuRelatorios	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuRelatorios() {
		if (JMenuRelatorios == null) {
			JMenuRelatorios = new JMenu();
			JMenuRelatorios.setText("Relatórios");
			JMenuRelatorios.setIcon(new ImageIcon(getClass().getResource("/br/com/projeto/imagens/C.png")));
			JMenuRelatorios.add(getItemRelVendas());
			JMenuRelatorios.add(getItemRelClientes());
			JMenuRelatorios.add(getItemRelProdutos());
			JMenuRelatorios.add(getItemRelFuncionarios());
			JMenuRelatorios.add(getItemRelUsuarios());
		}
		return JMenuRelatorios;
	}

	/**
	 * This method initializes JMenuSobre	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuSobre() {
		if (JMenuSobre == null) {
			JMenuSobre = new JMenu();
			JMenuSobre.setText("Sobre");
			JMenuSobre.setIcon(new ImageIcon(getClass().getResource("/br/com/projeto/imagens/D.png")));
			JMenuSobre.add(getItemSobre());
		}
		return JMenuSobre;
	}

	/**
	 * This method initializes JMenuSair	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuSair() {
		if (JMenuSair == null) {
			JMenuSair = new JMenu();
			JMenuSair.setText("Sair");
			JMenuSair.setIcon(new ImageIcon(getClass().getResource("/br/com/projeto/imagens/E.png")));
			JMenuSair.add(getItemSair());
		}
		return JMenuSair;
	}

	/**
	 * This method initializes ItemClientes	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemClientes() {
		if (ItemClientes == null) {
			ItemClientes = new JMenuItem();
			ItemClientes.setText("Clientes");
			ItemClientes.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/AA.png")));
		}
		return ItemClientes;
	}

	/**
	 * This method initializes ItemFuncionarios	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemFuncionarios() {
		if (ItemFuncionarios == null) {
			ItemFuncionarios = new JMenuItem();
			ItemFuncionarios.setText("Funcionários");
			ItemFuncionarios.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/AAA.png")));
		}
		return ItemFuncionarios;
	}

	/**
	 * This method initializes ItemProdutos	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemProdutos() {
		if (ItemProdutos == null) {
			ItemProdutos = new JMenuItem();
			ItemProdutos.setText("Produtos");
			ItemProdutos.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/AAAA.png")));
		}
		return ItemProdutos;
	}

	/**
	 * This method initializes ItemUsuarios	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemUsuarios() {
		if (ItemUsuarios == null) {
			ItemUsuarios = new JMenuItem();
			ItemUsuarios.setText("Usuários");
			ItemUsuarios.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/AAAAA.png")));
		}
		return ItemUsuarios;
	}

	/**
	 * This method initializes ItemVendas	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemVendas() {
		if (ItemVendas == null) {
			ItemVendas = new JMenuItem();
			ItemVendas.setText("Vendas");
			ItemVendas.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/BB.png")));
		}
		return ItemVendas;
	}

	/**
	 * This method initializes ItemRelVendas	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemRelVendas() {
		if (ItemRelVendas == null) {
			ItemRelVendas = new JMenuItem();
			ItemRelVendas.setText("Relatório de Vendas");
			ItemRelVendas.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/CC.png")));
		}
		return ItemRelVendas;
	}

	/**
	 * This method initializes ItemRelClientes	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemRelClientes() {
		if (ItemRelClientes == null) {
			ItemRelClientes = new JMenuItem();
			ItemRelClientes.setText("Relatório de Clientes");
			ItemRelClientes.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/CCC.png")));
		}
		return ItemRelClientes;
	}

	/**
	 * This method initializes ItemRelProdutos	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemRelProdutos() {
		if (ItemRelProdutos == null) {
			ItemRelProdutos = new JMenuItem();
			ItemRelProdutos.setText("Relatório de Produtos");
			ItemRelProdutos.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/CCCC.png")));
		}
		return ItemRelProdutos;
	}

	/**
	 * This method initializes ItemRelFuncionarios	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemRelFuncionarios() {
		if (ItemRelFuncionarios == null) {
			ItemRelFuncionarios = new JMenuItem();
			ItemRelFuncionarios.setText("Relatório de Funcionários");
			ItemRelFuncionarios.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/CCCCC.png")));
		}
		return ItemRelFuncionarios;
	}

	/**
	 * This method initializes ItemRelUsuarios	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemRelUsuarios() {
		if (ItemRelUsuarios == null) {
			ItemRelUsuarios = new JMenuItem();
			ItemRelUsuarios.setText("Relatório de Usuários");
			ItemRelUsuarios.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/CCCCCC.png")));
		}
		return ItemRelUsuarios;
	}

	/**
	 * This method initializes ItemSobre	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemSobre() {
		if (ItemSobre == null) {
			ItemSobre = new JMenuItem();
			ItemSobre.setText("Sobre");
			ItemSobre.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/DD.png")));
		}
		return ItemSobre;
	}

	/**
	 * This method initializes ItemSair	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getItemSair() {
		if (ItemSair == null) {
			ItemSair = new JMenuItem();
			ItemSair.setText("Sair");
			ItemSair.setIcon(new ImageIcon(getClass().getResource("/br/com/elvis/imagens/EE.png")));
		}
		return ItemSair;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * This is the default constructor
	 */
	public MenuPrincipal() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(419, 240);
		this.setJMenuBar(getJMenuPrincipal());
		this.setContentPane(getJContentPane());
		this.setTitle("Menu Principal");
		
		//Deixar tela maximizada
		Dimension tela=Toolkit.getDefaultToolkit() .getScreenSize();
		setSize(tela.width,tela.height);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="9,10"
