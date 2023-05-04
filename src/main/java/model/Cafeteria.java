package model;

import java.util.ArrayList;
import model.Cafe;

public class Cafeteria {
	private String nombre;
	private String direccion;
	private String redesSociales;
	private ArrayList<Cafe> cafes = new ArrayList<Cafe>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRedesSociales() {
		return this.redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}
}