package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Autos extends JFrame {
	private HashMap<Automovil, ArrayList<Venta>> ventas;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Autos frame = new Autos();
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
	public Autos() {
		
		ventas = new HashMap<Automovil, ArrayList<Venta>>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList listaVtas = new JList();
		listaVtas.setBounds(45, 240, 140, -221);
		contentPane.add(listaVtas);
		
		JList listaResumen = new JList();
		listaResumen.setBounds(423, 31, -201, 107);
		contentPane.add(listaResumen);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//DISPARAR VENTANA AGREGAR
				
			}
		});
		btnAgregar.setBounds(282, 177, 89, 23);
		contentPane.add(btnAgregar);
	}
}
