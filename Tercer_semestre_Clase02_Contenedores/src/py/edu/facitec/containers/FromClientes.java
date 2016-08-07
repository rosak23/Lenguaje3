package py.edu.facitec.containers;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class FromClientes extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FromClientes dialog = new FromClientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FromClientes() {
		setBounds(100, 100, 450, 300);
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(10, 15, 46, 14);
			panel.add(lblNombre);
			
			textField = new JTextField();
			textField.setBounds(62, 12, 111, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel lblApellido = new JLabel("Apellido:");
			lblApellido.setBounds(10, 42, 46, 14);
			panel.add(lblApellido);
			
			textField_1 = new JTextField();
			textField_1.setBounds(62, 39, 111, 20);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblDireccion = new JLabel("Direccion:");
			lblDireccion.setBounds(10, 74, 52, 14);
			panel.add(lblDireccion);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(62, 70, 111, 23);
			panel.add(textArea);
			
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setBounds(10, 123, 46, 14);
			panel.add(lblTelefono);
			
			textField_2 = new JTextField();
			textField_2.setBounds(62, 120, 111, 20);
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblActivo = new JLabel("Estado:");
			lblActivo.setBounds(10, 166, 46, 14);
			panel.add(lblActivo);
			
			JCheckBox chckbxActivo = new JCheckBox("Activo");
			chckbxActivo.setBounds(51, 162, 55, 23);
			panel.add(chckbxActivo);
			
			JLabel lblSexo = new JLabel("Sexo:");
			lblSexo.setBounds(10, 218, 46, 14);
			panel.add(lblSexo);
			
			JRadioButton rdbtnM = new JRadioButton("M");
			rdbtnM.setBounds(43, 214, 33, 23);
			panel.add(rdbtnM);
			
			JRadioButton rdbtnF = new JRadioButton("F");
			rdbtnF.setBounds(78, 214, 33, 23);
			panel.add(rdbtnF);
			
			JButton btnGuardar = new JButton("Guardar");
			btnGuardar.setBounds(224, 227, 89, 23);
			panel.add(btnGuardar);
			
			JButton btnModificar = new JButton("Modificar");
			btnModificar.setBounds(319, 227, 89, 23);
			panel.add(btnModificar);
		}
	}
}
