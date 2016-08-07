package PantallaSecundaria;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class FromClinte extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FromClinte dialog = new FromClinte();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FromClinte() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 46, 14);
		contentPanel.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(56, 8, 108, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 46, 46, 14);
		contentPanel.add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(56, 39, 108, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCiN = new JLabel("C.I N\u00BA:");
		lblCiN.setBounds(10, 84, 46, 14);
		contentPanel.add(lblCiN);
		
		textField_2 = new JTextField();
		textField_2.setBounds(56, 84, 108, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 132, 46, 14);
		contentPanel.add(lblSexo);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setBounds(43, 128, 33, 23);
		contentPanel.add(rdbtnM);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		rdbtnF.setBounds(89, 128, 33, 23);
		contentPanel.add(rdbtnF);
		
		JCheckBox chckbxActivo = new JCheckBox("Activo");
		chckbxActivo.setBounds(194, 128, 64, 23);
		contentPanel.add(chckbxActivo);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(151, 132, 37, 14);
		contentPanel.add(lblEstado);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(181, 217, 89, 23);
		contentPanel.add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(285, 217, 89, 23);
		contentPanel.add(btnModificar);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
