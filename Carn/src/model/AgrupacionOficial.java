package model;

/**
 * <h1>La clase Agrupaci&oacute;n oficial se utiliza para crear objetos de tipo
 * Agrupaci&oacute;n oficial que hereda de la clase padra Agrupaci&oacute;n</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 07-03-2023
 */
public abstract class AgrupacionOficial extends Agrupacion {
	/**
	 * Atributo in (integrante) de tipo integrante de Agrupaci&oacute;n oficial
	 * 
	 * @see Integrante
	 */
	public Integrante in[];
	/**
	 * Atributo puntos obtenidos de Agrupaci&oacute;n oficial
	 */
	private Integer puntosObtenidos;

	/**
	 * Constructor con parametros heredados de la clase padre
	 * 
	 * @see Agrupacion
	 */
	public AgrupacionOficial() {
		this(10);
	}

	/**
	 * Constructor con un solo par&aacute;metro Crea una nueva Agrupaci&oacute;n
	 * oficial con un determinado n&uacute;mero de integrantes a partir del
	 * parametro dado
	 * 
	 * @param totalintegrantes <i>Total de integrantes</i>
	 */
	public AgrupacionOficial(int totalIntegrantes) {
		Integrante in[] = new Integrante[totalIntegrantes];
	}

	/**
	 * Inserta un integrante en la Agrupaci&oacute;n oficial anteriormente creada
	 * 
	 * @param i <i>Integrante</i>
	 * @return true -> Agrega integrante
	 */
	public boolean instertarIntegrante(Integrante i) {
		boolean add = false;
		for (int l = 0; l < in.length; l++) {
			if (in[l] == null) {
				in[l] = i;
				add = true;
				break;
			}
		}
		return add;
	}

	/**
	 * Elimina un integrante en la Agrupaci&oacute;n oficial anteriormente creada
	 * 
	 * @param i <i>Integrante</i>
	 * @return true -> Elimina integrante
	 */
	public boolean eliminarIntegrante(Integrante i) {
		boolean elim = false;
		for (int l = 0; l < in.length; l++) {
			if (in[l] != null && in[l].equals(i)) {
				in[l] = null;
				elim = true;
				break;
			}
		}
		return elim;
 	}

	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

	public abstract String caminitoDelFalla();

	@Override
	public String toString() {
		return "AgrupacionOficial:" + super.toString() + ", Puntos Obtenidos=" + getPuntosObtenidos();
	}

}
