package model;

public class Coro extends AgrupacionOficial implements Callejera{
	
	private Integer numBandurrias;
	private Integer numGuitarras;
	
	public Coro() {
		super();
	}
	
	public Integer getNumBandurrias() {
		return numBandurrias;
	}

	public void setNumBandurrias(Integer numBandurrias) {
		this.numBandurrias = numBandurrias;
	}

	public Integer getNumGuitarras() {
		return numGuitarras;
	}

	public void setNumGuitarras(Integer numGuitarras) {
		this.numGuitarras = numGuitarras;
	}
	
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Coro de nombre " + this.getNombre() ;
		
	}

	@Override
	public String hacerTipo() {
		return "El Coro " + this.getNombre() + " va de " + this.getTipoDisfraz();
		
	}

	@Override
	public String caminitoDelFalla() {
		return "El Coro " + this.getNombre() + " va Caminito del Falla";
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Coro " + this.getNombre();
	}

	@Override
	public String toString() {
		return "Coro: "
				+ super.toString()
				+ ", Número de Bandurrias=" + getNumBandurrias() 
				+ ", Número de Guitarras=" + getNumGuitarras();
	}
	
	

}
