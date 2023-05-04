package model;

public class Cafe {
	private int cantidadGramos;
	private int mililitrosAgua;
	private String tamaño;
	private String ingredientesOpcionales;

	public int getCantidadGramos() {
		return this.cantidadGramos;
	}

	public void setCantidadGramos(int cantidadGramos) {
		this.cantidadGramos = cantidadGramos;
	}

	public int getMililitrosAgua() {
		return this.mililitrosAgua;
	}

	public void setMililitrosAgua(int mililitrosAgua) {
		this.mililitrosAgua = mililitrosAgua;
	}

	public String getTamaño() {
		return this.tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getIngredientesOpcionales() {
		return this.ingredientesOpcionales;
	}

	public void setIngredientesOpcionales(String ingredientesOpcionales) {
		this.ingredientesOpcionales = ingredientesOpcionales;
	}
}