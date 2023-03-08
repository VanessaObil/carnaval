package model;

/**
 * <h1>La clase Comparsa se utiliza para crear objetos de tipo comparsa</h1>
 * <h1>Hereda de la clase Agrupacionoficial e implementa la interfaz
 * Callejera</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 08-03-2023
 */
public class Comparsa extends AgrupacionOficial implements Callejera {
	/**
	 * Atributo empresa Atrezo de Comparsa
	 */
	private String empresaAtrezo;

	/**
	 * Constructor sin par&aacute;metros Hereda los par&aacute;metros de su clase
	 * padre
	 * 
	 * @see AgrupacionOficial
	 */
	public Comparsa() {
		super();
	}

	public String getEmpresaAtrezo() {
		return empresaAtrezo;
	}

	public void setEmpresaAtrezo(String empresaAtrezo) {
		this.empresaAtrezo = empresaAtrezo;
	}

	/**
	 * @return nombre de la Comparsa
	 * @see Agrupacion
	 */
	@Override
	public String cantarPresentacion() {
		return "Cantando la presentación de la Comparsa de nombre " + this.getNombre();

	}

	/**
	 * @return
	 *         <ul>
	 *         <li>nombre de la Comparsa</li>
	 *         <li>tipo de disfraz de la Comparsa</li>
	 *         </ul>
	 * @see Agrupacion
	 */
	@Override
	public String hacerTipo() {
		return "La Comparsa " + this.getNombre() + " va de " + this.getTipoDisfraz();

	}

	/**
	 * @return nombre de la Comparsa
	 */
	@Override
	public String caminitoDelFalla() {
		return "La Comparsa " + this.getNombre() + " va Caminito del Falla";
	}

	/**
	 * @return nombre de la Comparsa
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuchá la Comparsa " + this.getNombre();
	}

	@Override
	public String toString() {
		return "Comparsa: " + super.toString() + ", Empresa de Atrezo=" + getEmpresaAtrezo();
	}

}
