package model;

public class Cafe {
	private int cantidadGramos;
	private int mililitrosAgua;
	private String tama�o;
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

	public String getTama�o() {
		return this.tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getIngredientesOpcionales() {
		return this.ingredientesOpcionales;
	}

	public void setIngredientesOpcionales(String ingredientesOpcionales) {
		this.ingredientesOpcionales = ingredientesOpcionales;
	}
}