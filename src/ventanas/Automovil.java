package ventanas;

public class Automovil {
	private String marca;
	private String modelo;
	private int anio;
	
	public Automovil(String marca, String modelo, int a){
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAnio(a);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
}
