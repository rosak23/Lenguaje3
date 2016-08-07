package PantallaSecundaria;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class FomProveedor extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FomProveedor dialog = new FomProveedor();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public FomProveedor() {
		getContentPane().setLayout(null);
		
		setBounds(10, 10, 600, 300);
		JPanel panel = new JPanel();
		panel.setBounds(10, 224, 414, 26);
		getContentPane().add(panel);
		setModal(true);
		JButton btnGuardar = new JButton("Guardar");
		panel.add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		panel.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panel.add(btnEliminar);
		
		JButton btnCerrar = new JButton("Cerrar");
		panel.add(btnCerrar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(335, 0, 89, 23);
		getContentPane().add(btnNuevo);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(236, 0, 89, 23);
		getContentPane().add(btnBuscar);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 4, 46, 14);
		getContentPane().add(lblCodigo);
		
		textField = new JTextField();
		textField.setBounds(51, 1, 99, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(10, 37, 46, 14);
		getContentPane().add(lblDireccion);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(61, 34, 89, 26);
		getContentPane().add(textArea);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(10, 87, 46, 14);
		getContentPane().add(lblCiudad);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(10, 133, 46, 14);
		getContentPane().add(lblGenero);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(51, 129, 82, 23);
		getContentPane().add(rdbtnFemenino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(140, 129, 71, 23);
		getContentPane().add(rdbtnMasculino);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 176, 46, 14);
		getContentPane().add(lblEstado);
		
		JCheckBox chckbxActivo = new JCheckBox("Activo");
		chckbxActivo.setBounds(53, 172, 60, 23);
		getContentPane().add(chckbxActivo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Salos del Guaira", "Curuguaty", "Ciudad del Este", "Asuncion", "Hernandarias"}));
		comboBox.setBounds(51, 84, 82, 26);
		getContentPane().add(comboBox);

	}
}
