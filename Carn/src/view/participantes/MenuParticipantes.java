package view.participantes;

import view.Util;

public class MenuParticipantes {

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
			case 6 -> opcOrdInteNombre();
			}
		} while (opc != 0);
	}

	private static Object opcInscribirPartic() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object opcElimPartic() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object opcEditPartic() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object opcListPartic() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object opcListAgrupPartic() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object opcOrdInteNombre() {
		// TODO Auto-generated method stub
		return null;
	}

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
