package model;

/**
 * <h1>La clase Cuarteto se utiliza para crear objetos de tipo Cuarteto</h1>
 * <h1>Hereda de la clase Agrupacionoficial e implementa la interfaz
 * Callejera</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 08-03-2023
 */
public class Cuarteto extends AgrupacionOficial implements Callejera {
	/**
	 * Atributo n&uacute;mero de miembros de Cuarteto
	 */
	private Integer numeroMiembros;

	/**
	 * Constructor. Hereda los par&aacute;metros de la clsae padre
	 * 
	 * @see AgrupacionOficial
	 */
	public Cuarteto() {
		super();
	}

	public Integer getNumeroMiembros() {
		return numeroMiembros;
	}

	public void setNumeroMiembros(Integer numeroMiembros) {
		this.numeroMiembros = numeroMiembros;
	}

	/**
	 * @return nombre de la Comparsa
	 * @see Agrupacion
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Cuarteto de nombre " + this.getNombre();

	}

	/**
	 * @return
	 *         <ul>
	 *         <li>nombre del Cuarteto</li>
	 *         <li>tipo de disfraz del Cuarteto</li>
	 *         </ul>
	 * @see Agrupacion
	 */
	@Override
	public String hacerTipo() {
		return "El Cuarteto " + this.getNombre() + " va de " + this.getTipoDisfraz();

	}

	/**
	 * @return nombre del Cuareto
	 */
	@Override
	public String caminitoDelFalla() {
		return "El Cuarteto " + this.getNombre() + " va Caminito del Falla";
	}

	/**
	 * @return nombre del Cuarteto
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Cuarteto " + this.getNombre();
	}

	@Override
	public String toString() {
		return "Cuarteto: " + super.toString() + "Número de Miembros=" + getNumeroMiembros();
	}

}
