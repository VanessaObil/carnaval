package view.concurso;

import view.*;

public class MenuConcurso {

	public static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.LeerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> opcCaminito();
			case 2 -> opcHaceTipo();
			case 3 -> opcPresentacion();
			case 4 -> opcAsigPuntos();
			case 5 -> opcListTodos();
			case 6 -> Principal.opcListChirigotas();
			case 7 -> Principal.opcListComparsa();
			case 8 -> Principal.opcListCuarteto();
			case 9 -> opcOrdPuntos();
			case 10 -> Principal.opcOrdNombre();
			case 11 -> Principal.opcOrdAutor();
			case 12 -> Principal.opcOrdMusicaLetra();
			}
		} while (opc != 0);
	}

	private static Object opcCaminito() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object opcHaceTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object opcPresentacion() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object opcAsigPuntos() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void opcOrdPuntos() {
		Principal.coac.odenar_por_puntos(Principal.oficial);
	}

	public static void opcListTodos() {
		// TODO Auto-generated method stub

	}

	private static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir("GESTION DEL CONCURSO ");
		Util.escribir("Concurso:");
		Util.escribir("  1. Va camino del Falla.");
		Util.escribir("  2. Hacen el Tipo.");
		Util.escribir("  3. Canta la Presentación.");
		Util.escribir("  4. Asignar puntos.");
		Util.escribir("Listado de agrupaciones participantes:");
		Util.escribir("  5. Listar todos.");
		Util.escribir("  6. Listar Chirigotas.");
		Util.escribir("  7. Listar Coros.");
		Util.escribir("  8. Listar Cuartetos.");
		Util.escribir("  9. Listar Comparsas.");
		Util.escribir("Ordenación del listado:");
		Util.escribir(" 10. Ordenar por puntos.");
		Util.escribir(" 11. Ordenar por el nombre.");
		Util.escribir(" 12. Ordenar por el autor.");
		Util.escribir(" 13. Ordenar por autor de música/letra.");
	}

}
