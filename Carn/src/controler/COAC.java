package controler;

import java.util.Arrays;

import model.Agrupacion;
import model.AgrupacionOficial;
import model.Integrante;
import view.Principal;

public class COAC {

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

	public void odenar_por_puntos(AgrupacionOficial agOf[]) {
		for (int i = 0; i < agOf.length; i++) {
			Arrays.sort(agOf);
		}
	}

	public void odenar_por_nombre(Agrupacion ag) {
		Arrays.sort(Principal.oficial);
	}

	public void odenar_por_autor_musica_letra(Agrupacion ag) {

	}

	public void editar_agrupacion(Agrupacion ag) {

	}

	public static void listar_agrupaciones() {
		for (int i = 0; i < Principal.oficial.length; i++) {
			System.out.println(Principal.oficial);
		}
	}

	public void listar_chirigotas() {

	}

	public void listar_coros() {

	}

	public void listar_cuartetos() {

	}

	public void listar_comparsas() {

	}

	public void listar_romanceros() {

	}

	public void insertar_participante() {
		Integrante i = new Integrante();
		AgrupacionOficial ao;

	}

}
