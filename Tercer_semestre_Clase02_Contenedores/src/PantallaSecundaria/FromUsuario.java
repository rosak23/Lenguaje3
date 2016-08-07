package PantallaSecundaria;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FromUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FromUsuario dialog = new FromUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FromUsuario() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUsuario = new JLabel("Usuario");
			lblUsuario.setBounds(135, 11, 43, 33);
			contentPanel.add(lblUsuario);
		}
		{
			textField = new JTextField();
			textField.setBounds(99, 51, 136, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(99, 82, 136, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(43, 54, 46, 14);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblCodigo = new JLabel("Codigo:");
			lblCodigo.setBounds(43, 85, 46, 14);
			contentPanel.add(lblCodigo);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(74, 119, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnCalcelar = new JButton("Calcelar");
			btnCalcelar.setBounds(173, 119, 89, 23);
			contentPanel.add(btnCalcelar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
