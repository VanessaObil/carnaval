package model;

/**
 * <h1>La clase Agrupaci&oacute;n se utiliza para crear objetos de tipo
 * Agrupaci&oacute;n</h1>
 * 
 * @author Vanessa
 * @since 07-03-2023
 * @version 1-2023
 */
public abstract class Agrupacion implements Comparable<Agrupacion> {
	/**
	 * Atributo nombre de agrupaci&oacute;n
	 */
	private String nombre;
	/**
	 * Atributo autor de agrupaci&oacute;n
	 */
	private String autor;
	/**
	 * Atributo m&uacute;sica autor de agrupaci&oacute;n
	 */
	private String autorMusica;
	/**
	 * Atributo letra autor de agrupaci&oacute;n
	 */
	private String autorLetras;
	/**
	 * Atributo tipo de disfraz de agrupaci&oacute;n
	 */
	private String tipoDisfraz;

	/**
	 * Constructor sin par&aacute;metros
	 */
	public Agrupacion() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutorMusica() {
		return autorMusica;
	}

	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}

	public String getAutorLetras() {
		return autorLetras;
	}

	public void setAutorLetras(String autorLetras) {
		this.autorLetras = autorLetras;
	}

	public String getTipoDisfraz() {
		return tipoDisfraz;
	}

	public void setTipoDisfraz(String tipoDisfraz) {
		this.tipoDisfraz = tipoDisfraz;
	}

	public abstract String cantarPresentacion();

	public abstract String hacerTipo();

	@Override
	public int compareTo(Agrupacion o) {
		return this.getNombre().compareTo(o.getNombre());
	}

}
