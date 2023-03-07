package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{
	
	private Integer numeroMiembros;
	
	public Cuarteto() {
		super();
	}

	public Integer getNumeroMiembros() {
		return numeroMiembros;
	}

	public void setNumeroMiembros(Integer numeroMiembros) {
		this.numeroMiembros = numeroMiembros;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Cuarteto de nombre " + this.getNombre() ;
		
	}

	@Override
	public String hacerTipo() {
		return "El Cuarteto " + this.getNombre() + " va de " + this.getTipoDisfraz();
		
	}

	@Override
	public String caminitoDelFalla() {
		return "El Cuarteto " + this.getNombre() + " va Caminito del Falla";
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Cuarteto " + this.getNombre();
	}

	@Override
	public String toString() {
		return "Cuarteto: "
				+  super.toString()
				+ "Número de Miembros=" + getNumeroMiembros();
	}
	
	
	
	
}
