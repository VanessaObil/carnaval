package model;

public class Comparsa extends AgrupacionOficial implements Callejera{

	private String empresaAtrezo;
	
	public Comparsa() {
	super();
	}
	
	
	public String getEmpresaAtrezo() {
		return empresaAtrezo;
	}

	public void setEmpresaAtrezo(String empresaAtrezo) {
		this.empresaAtrezo = empresaAtrezo;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Comparsa de nombre " + this.getNombre() ;
		
	}

	@Override
	public String hacerTipo() {
		return "La Comparsa " + this.getNombre() + " va de " + this.getTipoDisfraz();
		
	}

	@Override
	public String caminitoDelFalla() {
		return "La Comparsa " + this.getNombre() + " va Caminito del Falla";
	}


	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Comparsa " + this.getNombre();
	}


	@Override
	public String toString() {
		return "Comparsa: "
				+ super.toString()
				+ ", Empresa de Atrezo=" + getEmpresaAtrezo();
	}
	
	
	
	
	
}
