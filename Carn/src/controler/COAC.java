package controler;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

import model.Agrupacion;
import model.AgrupacionOficial;
import model.Integrante;
import view.Principal;

/**
 * <h1>La clase COAC se utiliza para controlar las opciones que puede hacer el usuario que
 * ejecute las opciones del men&uacute; </h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 09-03-2023
 */
public class COAC {
/**
 * Inscribe una nueva Agrupacion
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
	 * @param agOf <i>Objeto de tipo AgrupacionOficial</i>
	 * @return true: agrega la Agrupacion
	 */
	public void odenar_por_puntos(AgrupacionOficial agOf[]) {
		for (int i = 0; i < agOf.length; i++) {
			Arrays.sort(agOf);
		}
	}
/**
 * Ordena las Agrupaciones por nombre
 * @param ag <i>Objeto de tipo Agrupacion  </i>
 */
	public void odenar_por_nombre(Agrupacion ag) {
		Arrays.sort(Principal.oficial);
	}

	public void odenar_por_autor_musica_letra(Agrupacion ag) {
		Arrays.sort(Principal.oficial);

	}
/**
 * Edita la agrupacion seleccionada
 * @param ag <i>Objeto de tipo Agrupacion</i>
 */
	public void editar_agrupacion(Agrupacion ag) {

	}
/**
 * Lista todas las agrupaciones que se hayan creado
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
	public static void listar_chirigotas() {
		
	}

	/**
	 * Lista todos los grupos de tipo Coro
	 * 	 */
	public void listar_coros() {

	}

	/**
	 * Lista todos los grupo de tipo Cuarteto
	 */
	public void listar_cuartetos() {

	}

	/**
	 * Lista todos los grupos de tipo Comparsa
	 */
	public void listar_comparsas() {

	}

	/**
	 * Lista todos los grupos de tipo Ropmancero 
	 * */
	public void listar_romanceros() {

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
