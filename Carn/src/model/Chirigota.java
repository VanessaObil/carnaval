package model;

/**
 * <h1>La clase Chirigota se utiliza para crear objetos de tipo chirigota</h1>
 * <h1>Hereda de la clase AgrupacionOficial e implementa la interfaz
 * Callejera</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 07-03-2023
 */
public class Chirigota extends AgrupacionOficial implements Callejera {
	/**
	 * Atributo n&uacute;mero de parejas de Chirigota
	 */
	private Integer numCuples;

	/**
	 * Contructor sin par&aacute;metros. Hereda la informaci&oacute;n de la clase
	 * padre
	 * 
	 * @see AgrupacionOficial
	 */
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
		return "Cantando la presentación de la Chirigota de nombre " + this.getNombre();
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
		return "Chirigota: " + super.toString() + ", Número Cuples=" + getNumCuples();
	}

}
