package model;

import java.util.Comparator;

/**
 * <h1>La clase OrdenarAutorMusica se utiliza para ordenar los valores por el
 * autor de la M&uacute;sica</h1>
 * <h1>Implementa la interfaz Comparator sobre la clase Agrupacion</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 08-03-2023
 */
public class OrdenarAutorMusica implements Comparator<Agrupacion> {

	/**
	 * Compara dos objetos de tipo Agrupacion, por orden del autor de la
	 * m&uacute;sica
	 * 
	 * @see Agrupacion
	 * @param o1 <i>Objeto 1 </i>
	 * @param o2 <i>Objeto 2 </i>
	 * @return autor -> Los devuelve de forma ordenada
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		return o1.getAutorMusica().compareTo(o2.getAutorMusica());
	}

	/**
	 * Compara si son iguales dos objetos de tipo Agrupacion, por orden del autor de
	 * la letra.
	 * 
	 * @see Agrupacion
	 * @param o1 <i>Objeto 1 </i>
	 * @param o2 <i>Objeto 2 </i>
	 * @return
	 *         <ul>
	 *         <li>true: son iguales</li>
	 *         <li>false: no son iguales</li>
	 *         </ul>
	 */
	public boolean equals(Agrupacion o1, Agrupacion o2) {
		return o1.getAutorLetras().equals(o2.getAutorLetras());
	}

}
