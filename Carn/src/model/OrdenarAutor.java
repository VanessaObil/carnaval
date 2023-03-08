package model;

import java.util.Comparator;

/**
 * <h1>La clase OrdenarAutor se utiliza para ordenar los valores por el
 * autor</h1>
 * <h1>Implementa la interfaz Comparator sobre la clase Agrupacion</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 08-03-2023
 */
public class OrdenarAutor implements Comparator<Agrupacion> {
	/**
	 * Compara dos objetos de tipo Agrupacion, por orden del autor
	 * 
	 * @see Agrupacion
	 * @param o1 <i>Objeto 1 </i>
	 * @param o2 <i>Objeto 2 </i>
	 * @return autor -> Los devuelve de forma ordenada
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		return o2.getAutor().compareTo(o2.getAutor());
	}
}
