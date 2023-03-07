package view;

import controler.COAC;
import model.*;
import view.concurso.*;
import view.participantes.*;

public class Principal {

	public static COAC coac = new COAC();
	public static AgrupacionOficial[] oficial = new AgrupacionOficial[5];

	public static void main(String[] args) {
		gestionPrograma();
	}

	private static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.LeerInt("Opción [0 - Salir] : ");
			switch (opc) {
			case 1 -> MenuParticipantes.opcIntegrantes();
			case 2 -> opcinscribirAgrupacion();
			case 3 -> opcElimAgrup();
			case 4 -> opcEditDatosAgrup();
			case 5 -> MenuConcurso.opcConcurso();
			case 6 -> opcListadoTodo();
			case 7 -> opcListChirigotas();
			case 8 -> opcListComparsa();
			case 9 -> opcListCuarteto();
			case 10 -> opcListRomancero();
			case 11 -> opcOrdNombre();
			case 12 -> opcOrdAutor();
			case 13 -> opcOrdMusicaLetra();
			}
		} while (opc != 0);
		finDelPrograma();
	}

	private static void opcinscribirAgrupacion() {
		int opc;
		do {
			Util.escribir("\n");
			Util.escribir("Seleccione una agrupación para inscirbir:");
			Util.escribir("  1. Chirigota");
			Util.escribir("  2. Comparsa");
			Util.escribir("  3. Coro");
			Util.escribir("  4. Cuarteto");
			Util.escribir("  5. Romancero");
			opc = Util.LeerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> addChirigota();
			case 2 -> addComparsa();
			case 3 -> addCoro();
			case 4 -> addCuarteto();
			case 5 -> addRomancero();
			}
		} while (opc != 0);
	}

	private static void addChirigota() {
		boolean add;
		Chirigota c = new Chirigota();
		String str;

		str = Util.LeerString("Nombre de la Chirigota: ");
		c.setNombre(str);

		str = Util.LeerString("Tipo de disfraz: ");
		c.setTipoDisfraz(str);

		str = Util.LeerString("Nombre del Autor: ");
		c.setAutor(str);

		str = Util.LeerString("Nombre del Autor de la letra: ");
		c.setAutorLetras(str);

		str = Util.LeerString("Nombre del Autor de la música");
		c.setAutorMusica(str);

		int n = Util.LeerInt("Número de Cuples: ");
		c.setNumCuples(n);

		add = coac.inscribir_agrupacion(c);

		if (add) {
			System.out.println("Se ha añadido una nueva Chirigota.");
		} else {
			System.err.println("No se ha podido añadir una nueva Chirigota.");
		}
	}

	private static void addComparsa() {
		boolean add;
		Comparsa c = new Comparsa();
		String str;

		str = Util.LeerString("Nombre de la Chirigota: ");
		c.setNombre(str);

		str = Util.LeerString("Tipo de disfraz: ");
		c.setTipoDisfraz(str);

		str = Util.LeerString("Nombre del Autor: ");
		c.setAutor(str);

		str = Util.LeerString("Nombre del Autor de la letra: ");
		c.setAutorLetras(str);

		str = Util.LeerString("Nombre del Autor de la música");
		c.setAutorMusica(str);

		str = Util.LeerString("Nombre de la empresa de atrezo: ");
		c.setEmpresaAtrezo(str);

		add = COAC.inscribir_agrupacion(c);

		if (add) {
			System.out.println("Se ha añadido una nueva Comparsa.");
		} else {
			System.err.println("No se ha podido añadir una nueva Comparsa.");
		}
	}

	private static void addCoro() {
		boolean add;
		Coro c = new Coro();
		String str;

		str = Util.LeerString("Nombre de la Chirigota: ");
		c.setNombre(str);

		str = Util.LeerString("Tipo de disfraz: ");
		c.setTipoDisfraz(str);

		str = Util.LeerString("Nombre del Autor: ");
		c.setAutor(str);

		str = Util.LeerString("Nombre del Autor de la letra: ");
		c.setAutorLetras(str);

		str = Util.LeerString("Nombre del Autor de la música");
		c.setAutorMusica(str);

		int n = Util.LeerInt("Número de Bandurrias: ");
		c.setNumBandurrias(n);

		n = Util.LeerInt("Número de Guitarras: ");
		c.setNumGuitarras(n);

		add = COAC.inscribir_agrupacion(c);

		if (add) {
			System.out.println("Se ha añadido un nuevo Coro.");
		} else {
			System.err.println("No se ha podido añadir un nuevo Coro.");
		}
	}

	private static void addCuarteto() {
		boolean add;
		Cuarteto c = new Cuarteto();
		String str;

		str = Util.LeerString("Nombre de la Chirigota: ");
		c.setNombre(str);

		str = Util.LeerString("Tipo de disfraz: ");
		c.setTipoDisfraz(str);

		str = Util.LeerString("Nombre del Autor: ");
		c.setAutor(str);

		str = Util.LeerString("Nombre del Autor de la letra: ");
		c.setAutorLetras(str);

		str = Util.LeerString("Nombre del Autor de la música");
		c.setAutorMusica(str);

		int n = Util.LeerInt("Número de Cuples: ");
		c.setNumeroMiembros(n);

		add = COAC.inscribir_agrupacion(c);

		if (add) {
			System.out.println("Se ha añadido un nuevo Cuarteto.");
		} else {
			System.err.println("No se ha podido añadir un nuevo Cuarteto.");
		}
	}

	private static void addRomancero() {
		boolean add;
		Romancero c = new Romancero();
		String str;

		str = Util.LeerString("Nombre de la Chirigota: ");
		c.setNombre(str);

		str = Util.LeerString("Nombre del Autor: ");
		c.setAutor(str);

		str = Util.LeerString("Tipo de disfraz: ");
		c.setTipoDisfraz(str);

		str = Util.LeerString("Nombre del Autor de la letra: ");
		c.setAutorLetras(str);

		str = Util.LeerString("Nombre del Autor de la música");
		c.setAutorMusica(str);

		str = Util.LeerString("Temática del cartelón: ");
		c.setTematicaCartelon(str);

		add = COAC.inscribir_agrupacion(c);

		if (add) {
			System.out.println("Se ha añadido un nuevo Romancero.");
		} else {
			System.err.println("No se ha podido añadir un nuevo Romancero.");
		}
	}

	private static void opcElimAgrup() {
		int opc;
		do {
			Util.escribir("\n");
			Util.escribir("Seleccione una agrupación para eliminar:");
			Util.escribir("  1. Chirigota");
			Util.escribir("  2. Comparsa");
			Util.escribir("  3. Coro");
			Util.escribir("  4. Cuarteto");
			Util.escribir("  5. Romancero");
			opc = Util.LeerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> delChirigota();
			case 2 -> delComparsa();
			case 3 -> delCoro();
			case 4 -> delCuarteto();
			case 5 -> delRomancero();
			}
		} while (opc != 0);
	}

	private static void delChirigota() {
		boolean del;
		int opc;

		for (int i = 0; i < oficial.length; i++) {

		}
		opc = Util.LeerInt("Seleccione una opción para eliminar: ");

		coac.eliminar_agrupacion(oficial[opc]);

	}

	private static void delComparsa() {
		boolean del;
		int opc;

		for (int i = 0; i < oficial.length; i++) {

		}
		opc = Util.LeerInt("Seleccione una opción para eliminar: ");

		COAC.eliminar_agrupacion(oficial[opc]);
	}

	private static void delCoro() {
		boolean del;
		int opc;

		for (int i = 0; i < oficial.length; i++) {

		}
		opc = Util.LeerInt("Seleccione una opción para eliminar: ");

		COAC.eliminar_agrupacion(oficial[opc]);
	}

	private static void delCuarteto() {
		boolean del;
		int opc;

		for (int i = 0; i < oficial.length; i++) {

		}
		opc = Util.LeerInt("Seleccione una opción para eliminar: ");

		COAC.eliminar_agrupacion(oficial[opc]);
	}

	private static void delRomancero() {
		boolean del;
		int opc;

		for (int i = 0; i < oficial.length; i++) {

		}
		opc = Util.LeerInt("Seleccione una opción para eliminar: ");

		COAC.eliminar_agrupacion(oficial[opc]);
	}

	private static void opcEditDatosAgrup() {
		int opc;

		for (int i = 0; i < oficial.length; i++) {
			System.out.println(oficial[i]);
		}
		opc = Util.LeerInt("Seleccione una agrupación a editar: ");

		String str = Util.LeerString("Nombre(" + oficial[opc].getNombre() + "): ");
		if (str.equalsIgnoreCase("")) {
			oficial[opc].setNombre(oficial[opc].getNombre());
		} else {
			oficial[opc].setNombre(str);
		}

		str = Util.LeerString("Autor(" + oficial[opc].getTipoDisfraz() + "): ");
		if (str.equalsIgnoreCase("")) {
			oficial[opc].setTipoDisfraz(oficial[opc].getTipoDisfraz());
		} else {
			oficial[opc].setTipoDisfraz(str);
		}

		str = Util.LeerString("Autor(" + oficial[opc].getAutor() + "): ");
		if (str.equalsIgnoreCase("")) {
			oficial[opc].setAutor(oficial[opc].getAutor());
		} else {
			oficial[opc].setAutor(str);
		}

		str = Util.LeerString("Autor de letra(" + oficial[opc].getAutorLetras() + "): ");
		if (str.equalsIgnoreCase("")) {
			oficial[opc].setAutorLetras(oficial[opc].getAutorLetras());
		} else {
			oficial[opc].setAutorLetras(str);
		}

		str = Util.LeerString("Autor de musica(" + oficial[opc].getAutorMusica() + "): ");
		if (str.equalsIgnoreCase("")) {
			oficial[opc].setAutorMusica(oficial[opc].getAutorMusica());
		} else {
			oficial[opc].setAutorMusica(str);
		}

	}

	private static void opcListadoTodo() {
		COAC.listar_agrupaciones();
	}

	public static Object opcListChirigotas() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object opcListRomancero() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object opcListCuarteto() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object opcListComparsa() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object opcOrdMusicaLetra() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object opcOrdAutor() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object opcOrdNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void mostrarMenuPrincipal() {
		Util.escribir("\n");
		Util.escribir(" GESTION DE AGRUPACIONES ");
		Util.escribir("  1. Gestión de Participantes.");
		Util.escribir("  2. Añadir una agrupación.");
		Util.escribir("  3. Eliminar una agrupación.");
		Util.escribir("  4. Editar datos de una agrupación.");
		Util.escribir("  5. Gestión del Concurso.");
		Util.escribir("Listado de agrupaciones:");
		Util.escribir("  6. Listar todas.");
		Util.escribir("  7. Listar Chirigotas.");
		Util.escribir("  8. Listar Coros.");
		Util.escribir("  9. Listar Cuartetos.");
		Util.escribir(" 10. Listar Romanceros.");
		Util.escribir("Ordenar el listado:");
		Util.escribir(" 11. Ordenar por el nombre.");
		Util.escribir(" 12. Ordenar por el autor.");
		Util.escribir(" 13. Ordenar por el autor de música/letra.");
	}

	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}
}