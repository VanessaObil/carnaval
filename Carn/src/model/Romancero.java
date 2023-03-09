package model;

/**
 * <h1>La clase Romancero se utiliza para crear objetos de tipo Romancero</h1>
 * <h1>Hereda de la clase Agrupacion e implementa la interfaz Callejera</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 09-03-2023
 */
public class Romancero extends Agrupacion implements Callejera {
	/**
	 * Atributo tematica de cartelon de Romancero
	 */
	private String tematicaCartelon;

	/**
	 * Constructor sin par&aacute;metros Hereda los datos de la clase padre ç
	 * 
	 * @see Agrupacion
	 */
	public Romancero() {
		super();
	}

	public String getTematicaCartelon() {
		return tematicaCartelon;
	}

	public void setTematicaCartelon(String tematicaCartelon) {
		this.tematicaCartelon = tematicaCartelon;
	}

	/**
	 * @return nombre del Romancero
	 * @see Agrupacion
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación del Romancero de nombre " + this.getNombre();
	}

	/**
	 * @return
	 *         <ul>
	 *         <li>nombre del Romancero</li>
	 *         <li>tipo de disfraz de Romancero</li>
	 *         </ul>
	 * @see Agrupacion
	 */

	@Override
	public String hacerTipo() {
		return "El romancero " + this.getNombre() + " va de " + this.getTipoDisfraz();
	}

	/**
	 * @return nombre de Romancero
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuchá al Romancero " + this.getNombre();
	}

	@Override
	public String toString() {
		return "Romancero: " + super.toString() + ", Tematica del Cartelon=" + getTematicaCartelon();
	}

}
