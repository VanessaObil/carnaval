package model;


public class Romancero extends Agrupacion implements Callejera{
	
	private String tematicaCartelon;
	
	public Romancero() {
		super();
	}
	
	public String getTematicaCartelon() {
		return tematicaCartelon;
	}

	public void setTematicaCartelon(String tematicaCartelon) {
		this.tematicaCartelon = tematicaCartelon;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Romancero de nombre " + this.getNombre() ;
	}

	@Override
	public String hacerTipo() {
		return "El romancero " + this.getNombre() + " va de " + this.getTipoDisfraz();
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá al Romancero " + this.getNombre();
	}

	@Override
	public String toString() {
		return "Romancero: "
				+ super.toString()
				+ ", Tematica del Cartelon=" + getTematicaCartelon();
	}
	
	
}
