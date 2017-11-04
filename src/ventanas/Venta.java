package ventanas;

public class Venta {
	private int mes;
	private float precio;
	
	public Venta(int mes, float precio){
		this.setMes(mes);
		this.setPrecio(precio);
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
