package ventanas;

public class Venta {
	private int mes;
	private int precio;
	
	public Venta(int mes, int precio){
		this.setMes(mes);
		this.setPrecio(precio);
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
