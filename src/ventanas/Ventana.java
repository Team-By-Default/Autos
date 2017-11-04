package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class Ventana extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField marcaVentana;
	private JTextField modeloVentana;
	private JTextField precioVentanqa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventana dialog = new Ventana();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ventana() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		Label anio = new Label("A\u00F1o");
		anio.setBounds(10, 23, 62, 22);
		contentPanel.add(anio);
		
		Label mes = new Label("Mes");
		mes.setBounds(228, 23, 62, 22);
		contentPanel.add(mes);
		
		marcaVentana = new JTextField();
		marcaVentana.setBounds(190, 72, 120, 20);
		contentPanel.add(marcaVentana);
		marcaVentana.setColumns(10);
		
		modeloVentana = new JTextField();
		modeloVentana.setBounds(190, 103, 120, 20);
		contentPanel.add(modeloVentana);
		modeloVentana.setColumns(10);
		
		precioVentanqa = new JTextField();
		precioVentanqa.setBounds(190, 134, 120, 20);
		contentPanel.add(precioVentanqa);
		precioVentanqa.setColumns(10);
		
		JLabel marca = new JLabel("Marca");
		marca.setBounds(116, 75, 46, 14);
		contentPanel.add(marca);
		
		JLabel modelo = new JLabel("Modelo");
		modelo.setBounds(114, 106, 46, 14);
		contentPanel.add(modelo);
		
		JLabel precio = new JLabel("Precio");
		precio.setBounds(114, 137, 46, 14);
		contentPanel.add(precio);
		
		JComboBox anioVentana = new JComboBox();
		anioVentana.setBounds(60, 23, 120, 20);
		contentPanel.add(anioVentana);
		
		JComboBox mesVentana = new JComboBox();
		mesVentana.setBounds(296, 25, 106, 22);
		contentPanel.add(mesVentana);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				anioVentana.setSelectedItem(1900);
				JButton aceptarButton = new JButton("Aceptar");
				aceptarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				aceptarButton.setActionCommand("OK");
				buttonPane.add(aceptarButton);
				getRootPane().setDefaultButton(aceptarButton);
			}
			{
				JButton cancelarButton = new JButton("Cancelar");
				cancelarButton.setActionCommand("Cancel");
				buttonPane.add(cancelarButton);
			}
		}
		
	}
}
