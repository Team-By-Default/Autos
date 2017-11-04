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
import java.util.Map;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;

public class VentanaPpal extends JFrame {
	private HashMap<Automovil, ArrayList<Venta>> ventas;
	private JList listaVtas;
	private JList listaResumen;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPpal frame = new VentanaPpal();
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
	public VentanaPpal() {
		
		ventas = new HashMap<Automovil, ArrayList<Venta>>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.listaVtas = new JList();
		listaVtas.setBounds(45, 240, 140, -221);
		contentPane.add(listaVtas);
		
		this.listaResumen = new JList();
		listaResumen.setBounds(423, 31, -201, 107);
		contentPane.add(listaResumen);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventana ventanita = new Ventana(this);
			}
		});
		btnAgregar.setBounds(282, 177, 89, 23);
		contentPane.add(btnAgregar);
	}
	
	public void agregarVta(Automovil auto, Venta venta){
		ArrayList vtas = this.ventas.get(auto);
		if(vtas == null)
			vtas = new ArrayList<Venta>();
		vtas.add(venta);
		this.ventas.put(auto, vtas);
	}
	
	private void actualizarListas(){
		ArrayList<Venta> ventaaux;
		Automovil autoaux;
		int prom,min,max;
		for(Entry<Automovil, ArrayList<Venta>> entry : ventas.entrySet()){

			autoaux = entry.getKey();
			ventaaux = entry.getValue();
			min=minimo(ventaaux);
			max=maximo(ventaaux);
			prom=promedio(ventaaux);
			
			
			
			//mostrar en la ventana Marca, Modelo y Año de autoaux y prom, min y max de ese Automovil
		}
	}
	
	public static int promedio(ArrayList<Venta> ventas){
		int prom=0;
		for(int i=0; i<ventas.size(); i++)
			prom+=ventas.get(i).getPrecio();
		prom=prom/ventas.size();
		return prom;
	}

	public static int minimo(ArrayList<Venta> ventas){
		int min=0;
		for(int i=0; i<ventas.size(); i++){
			if(ventas.get(i).getPrecio()<min)
				min=ventas.get(i).getPrecio();
		}
		return min;
	}

	public static int maximo(ArrayList<Venta> ventas){
		int max=0;
		for(int i=0; i<ventas.size(); i++){
			if(ventas.get(i).getPrecio()>max)
				max=ventas.get(i).getPrecio();
		}
		return max;
	}
}
