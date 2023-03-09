package view.participantes;

import view.Util;

/**
 * <h1>La clase MenuConcurso muestra el men&uacute; de los participantes con el
 * cual el usuario interactuar&aacute;</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 09-03-2023
 */
public class MenuParticipantes {

	/**
	 * Muestra un men&uacute; de las opciones en torno a los participantes
	 */
	public static void opcIntegrantes() {
		int opc;
		do {
			mostrarMenuIntegrantes();
			opc = Util.LeerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> opcInscribirPartic();
			case 2 -> opcElimPartic();
			case 3 -> opcEditPartic();
			case 4 -> opcListPartic();
			case 5 -> opcListAgrupPartic();
			}
		} while (opc != 0);
	}

	/**
	 * Inscribe un nuevo participante
	 * 
	 * @return nuevo participante
	 */
	private static Object opcInscribirPartic() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Elimina un participante existente
	 * 
	 * @return elimina participante
	 */
	private static Object opcElimPartic() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Edita los datos del participante
	 * 
	 * @return nuevos datos actualizados del participante
	 */
	private static Object opcEditPartic() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Lista de participantes
	 * 
	 * @return Lista de todos los participantes
	 */
	private static Object opcListPartic() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Lista de opciones de Agrupacion de participantes
	 * 
	 * @return opciones de Agrupacion de los participantes
	 */
	private static Object opcListAgrupPartic() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Muestra un men&uacute; de integrantes
	 */
	private static void mostrarMenuIntegrantes() {
		Util.escribir("\n");
		Util.escribir("GESTION DE PARTICIPANTES ");
		Util.escribir("  1. Añadir un participante.");
		Util.escribir("  2. Borrar un participante.");
		Util.escribir("  3. Editar los datos de un participante.");
		Util.escribir("  4. Listar todos los participantes.");
		Util.escribir("  5. Listar agrupaciones donde es integrante.");
		Util.escribir("  6. Ordenar por el nombre.");
	}

}
