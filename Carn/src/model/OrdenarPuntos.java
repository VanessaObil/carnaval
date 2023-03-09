package model;

import java.util.Comparator;

/**
 * <h1>La clase OrdenarPuntos se utiliza para ordenar los valores por los puntos
 * que tenga cada grupo</h1>
 * <h1>Implementa la interfaz Comparator sobre la clase AgrupacionOficial</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 09-03-2023
 */
public class OrdenarPuntos implements Comparator<AgrupacionOficial> {

	/**
	 * Compara los puntos de dos objetos de tipo AgrupacionOficial
	 * 
	 * @see AgrupacionOficial
	 * @param o1 <i>Objeto 1 </i>
	 * @param o2 <i>Objeto 2 </i>
	 * @retur puntosObtenidos -> Los devuelve de forma ordenada
	 */
	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		return o1.getPuntosObtenidos().compareTo(o2.getPuntosObtenidos());
	}

}
