package py.edu.facitec.containers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import PantallaSecundaria.FomProveedor;
import PantallaSecundaria.FromClinte;
import PantallaSecundaria.FromUsuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// le informa al so que
														// ha terminado el
														// proceso
		setBounds(100, 100, 450, 300);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		JMenu mnHerramientas = new JMenu("Herramientas");
		menuBar.add(mnHerramientas);

		JMenu mnFormularios = new JMenu("Formularios");
		menuBar.add(mnFormularios);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verFormularioCliente();
			}
		});
		mnFormularios.add(mntmCliente);

		JMenuItem mntmProveedor = new JMenuItem("Proveedor");
		mntmProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verFormularioProveedor();
			}
		});
		mnFormularios.add(mntmProveedor);

		JMenu mnOpciones = new JMenu("Opciones");
		mnFormularios.add(mnOpciones);

		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mnOpciones.add(mntmBuscar);

		JMenuItem mntmUsuario = new JMenuItem("Usuario");
		mntmUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verFromUsuario();
			}
		});
		mnFormularios.add(mntmUsuario);
	}

	private void verFormularioProveedor() {
		FomProveedor fomProveedor = new FomProveedor();
		fomProveedor.setVisible(true);
	}

	private void verFormularioCliente() {
		FromClinte fromCliente = new FromClinte();
		fromCliente.setVisible(true);
	}

	private void verFromUsuario() {
		//FromUsuario fromUsuario = new FromUsuario();
		//fromUsuario.setVisible(true);
		FromUsuario fromUsuario = new FromUsuario();
		fromUsuario.setVisible(true);
	}
}
