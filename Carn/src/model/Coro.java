package model;

/**
 * <h1>La clase Coro se utiliza para crear objetos de tipo coro</h1>
 * <h1>Hereda de la clase Agrupacionoficial e implementa la interfaz
 * Callejera</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 08-03-2023
 */
public class Coro extends AgrupacionOficial implements Callejera {
	/**
	 * Atributo n&uacute;mero de bandurrias de Coro
	 */
	private Integer numBandurrias;
	/**
	 * 
	 * Atributo n&uacute;mero de guitarras de Coro
	 */
	private Integer numGuitarras;

	/**
	 * Constructor con par&aacute;metros heredados de la clase padre
	 * 
	 * @see AgrupacionOficial
	 */
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

	/**
	 * @return nombre del Coro
	 * @see Agrupacion
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Coro de nombre " + this.getNombre();

	}

	/**
	 * @return
	 *         <ul>
	 *         <li>nombre del Coro</li>
	 *         <li>tipo de disfraz del Coro</li>
	 *         </ul>
	 * @see Agrupacion
	 */
	@Override
	public String hacerTipo() {
		return "El Coro " + this.getNombre() + " va de " + this.getTipoDisfraz();

	}

	/**
	 * @return nombre del Coro
	 */
	@Override
	public String caminitoDelFalla() {
		return "El Coro " + this.getNombre() + " va Caminito del Falla";
	}

	/**
	 * @return nombre del Coro
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuchá el Coro " + this.getNombre();
	}

	@Override
	public String toString() {
		return "Coro: " + super.toString() + ", Número de Bandurrias=" + getNumBandurrias() + ", Número de Guitarras="
				+ getNumGuitarras();
	}

}
