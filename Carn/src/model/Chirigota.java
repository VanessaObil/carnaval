package model;

public class Chirigota extends AgrupacionOficial implements Callejera{
	
	private Integer numCuples;
	
	
	public Chirigota() {
		super();
	}


	public Integer getNumCuples() {
		return numCuples;
	}


	public void setNumCuples(Integer numCuples) {
		this.numCuples = numCuples;
	}


	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Chirigota de nombre " + this.getNombre() ;
	}

	@Override
	public String hacerTipo() {
		return "La Chirigota " + this.getNombre() + " va de " + this.getTipoDisfraz();
	}

	@Override
	public String caminitoDelFalla() {
		return "La Chitigota " + this.getNombre() + " va Caminito del Falla";
	}


	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Chirigota " + this.getNombre();
	}


	@Override
	public String toString() {
		return "Chirigota: "
				+ super.toString()
				+ ", Número Cuples=" + getNumCuples();
	}
	
	
	
	
	
	
	
}
