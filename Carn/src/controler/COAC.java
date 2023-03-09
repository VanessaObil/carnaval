package controler;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

import model.Agrupacion;
import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Integrante;
import model.Romancero;
import view.Principal;

/**
 * <h1>La clase COAC se utiliza para controlar las opciones que puede hacer el
 * usuario que ejecute las opciones del men&uacute;</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 09-03-2023
 */
public class COAC {
	/**
	 * Inscribe una nueva Agrupacion
	 * 
	 * @param Agrupacion <i>Objeto de tipo Agrupacion</i>
	 * @return true: agrega la Agrupacion
	 */
	public static boolean inscribir_agrupacion(Agrupacion Agrupacion) {
		boolean add = false;
		for (int l = 0; l < Principal.oficial.length; l++) {
			if (Principal.oficial[l] == null) {
				Principal.oficial[l] = (AgrupacionOficial) Agrupacion;
				add = true;
				break;
			}
		}
		return add;
	}

	/**
	 * Elimina una Agrupacion existente
	 * 
	 * @param agrupacion <i>Objeto de tipo Agrupacion</i>
	 * @return true: elimina la Agrupacion
	 */
	public static boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
		boolean elim = false;
		for (int l = 0; l < Principal.oficial.length; l++) {
			if (Principal.oficial[l] != null && Principal.oficial[l].equals(agrupacion)) {
				Principal.oficial[l] = null;
				elim = true;
				break;
			}
		}
		return elim;
	}

	/**
	 * Ordena las AgrupacionesOficiales por orden de puntos
	 * 
	 * @param agOf <i>Objeto de tipo AgrupacionOficial</i>
	 * @return true: agrega la Agrupacion
	 */
	public static void odenar_por_puntos(AgrupacionOficial agOf[]) {
		for (int i = 0; i < agOf.length; i++) {
			Arrays.sort(agOf);
		}
	}

	/**
	 * Ordena las Agrupaciones por nombre
	 * 
	 * @param ag <i>Objeto de tipo Agrupacion </i>
	 */
	public static void odenar_por_nombre(Agrupacion ag) {
		Arrays.sort(Principal.oficial);
	}

	public static void odenar_por_autor_musica_letra(Agrupacion ag) {
		Arrays.sort(Principal.oficial);

	}

	/**
	 * Lista todas las agrupaciones que se hayan creado
	 * 
	 * @see Principal
	 */
	public static void listar_agrupaciones() {
		for (int i = 0; i < Principal.oficial.length; i++) {
			System.out.println(Principal.oficial);
		}
	}

	/**
	 * Lista todos los grupos de tipo Chirigota
	 */
	public static Agrupacion[] listar_chirigotas(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Chirigota) {
				cont++;
			}
		}

		Chirigota[] chirigota = new Chirigota[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Chirigota) {
				chirigota[cont++] = (Chirigota) agrupaciones[i];
			}
		}
		return chirigota;
	}

	/**
	 * Lista todos los grupos de tipo Coro
	 */
	public static Agrupacion[] listar_coros(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Coro) {
				cont++;
			}
		}

		Coro[] coro = new Coro[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Coro) {
				coro[cont++] = (Coro) agrupaciones[i];
			}
		}
		return coro;
	}

	/**
	 * Lista todos los grupo de tipo Cuarteto
	 */
	public static Agrupacion[] listar_cuartetos(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Cuarteto) {
				cont++;
			}
		}

		Cuarteto[] cuarteto = new Cuarteto[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Cuarteto) {
				cuarteto[cont++] = (Cuarteto) agrupaciones[i];
			}
		}
		return cuarteto;
	}

	/**
	 * Lista todos los grupos de tipo Comparsa
	 */
	public static Agrupacion[] listar_comparsas(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Comparsa) {
				cont++;
			}
		}

		Comparsa[] comparsa = new Comparsa[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Comparsa) {
				comparsa[cont++] = (Comparsa) agrupaciones[i];
			}
		}
		return comparsa;
	}

	/**
	 * Lista todos los grupos de tipo Ropmancero
	 */
	public static Agrupacion[] listar_romanceros(Agrupacion[] agrupaciones) {
		int cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Romancero) {
				cont++;
			}
		}

		Romancero[] romancero = new Romancero[cont];
		cont = 0;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] instanceof Romancero) {
				romancero[cont++] = (Romancero) agrupaciones[i];
			}
		}
		return romancero;
	}

	/**
	 * Inserta un nuevo participante al grupo que corresponda
	 * 
	 */
	public void insertar_participante() {
		Integrante i = new Integrante();
		AgrupacionOficial ao;

	}

}
