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
	public Ventana( ) {
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
		
		JComboBox<Integer> anioVentana = new JComboBox<Integer>();
		for (int i = 1990; i < 2018 ; i++) {
			anioVentana.addItem(i);
		}
		anioVentana.setMaximumRowCount(20);
		anioVentana.setSelectedIndex(-1);
		anioVentana.setBounds(74, 23, 106, 20);
		contentPanel.add(anioVentana);
		
		JComboBox<String> mesVentana = new JComboBox<String>();
		mesVentana.addItem("Enero");
		mesVentana.addItem("Febrero");
		mesVentana.addItem("Marzo");
		mesVentana.addItem("Abril");
		mesVentana.addItem("Mayo");
		mesVentana.addItem("Junio");
		mesVentana.addItem("Julio");
		mesVentana.addItem("Agosto");
		mesVentana.addItem("Septiembre");
		mesVentana.addItem("Octubre");
		mesVentana.addItem("Noviembre");
		mesVentana.addItem("Diciembre");
		mesVentana.setMaximumRowCount(12);
		mesVentana.setSelectedIndex(-1);
		mesVentana.setBounds(296, 25, 106, 22);
		contentPanel.add(mesVentana);
		
		JComboBox<String> marcaCombobox = new JComboBox<String>();
		marcaCombobox.addItem("Fiat");marcaCombobox.addItem("Fiat");
		marcaCombobox.addItem("Crevrolet");
		marcaCombobox.addItem("Renault");
		marcaCombobox.addItem("Citroen");
		marcaCombobox.setMaximumRowCount(20);
		marcaCombobox.setSelectedIndex(-1);
		marcaCombobox.setBounds(190, 72, 120, 20);
		contentPanel.add(marcaCombobox);
		{
	
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JButton aceptarButton = new JButton("Aceptar");
				aceptarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Automovil fitito = new Automovil(marcaCombobox.toString(),modeloVentana.toString(),anioVentana.getItemAt(0));
						Venta ven = new Venta(comvertir(mesVentana.toString()),precioVentanqa.getText());
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
	
	public int comvertir(String mes){
		if (mes.equals("Enero")) {
			return 1;
		}
		if (mes.equals("Febrero")) {
			return 2;
		}
		if (mes.equals("Marzo")) {
			return 3;
		}
		if (mes.equals("Abril")) {
			return 4;
		}
		if (mes.equals("Mayo")) {
			return 5;
		}
		if (mes.equals("Junio")) {
			return 6;
		}
		if (mes.equals("Julio")) {
			return 7;
		}
		if (mes.equals("Agosto")) {
			return 8;
		}
		if (mes.equals("Septiembre")) {
			return 9;
		}
		if (mes.equals("Octubre")) {
			return 10;
		}
		if (mes.equals("Noviembre")) {
			return 11;
		}
		if (mes.equals("Diciembre")) {
			return 12;
		}
		return 0;
		
	}
	
}
