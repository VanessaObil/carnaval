package model;

public abstract class AgrupacionOficial extends Agrupacion {

	public Integrante in[];
	private Integer puntosObtenidos;

	public AgrupacionOficial() {
		this(10);
	}

	public AgrupacionOficial(int totalIntegrantes) {
		Integrante in[] = new Integrante[totalIntegrantes];
	}

	public boolean instertarIntegrante(Integrante i) {
		boolean add = false;
		for (int l = 0; l < in.length; l++) {
			if (in[l] == null) {
				in[l] = i;
				add = true;
				break;
			}
		}
		return add;
	}

	public boolean eliminarIntegrante(Integrante i) {
		boolean elim = false;
		for (int l = 0; l < in.length; l++) {
			if (in[l] != null && in[l].equals(i)) {
				in[l] = null;
				elim = true;
				break;
			}
		}
		return elim;
	}

	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

	public abstract String caminitoDelFalla();

	@Override
	public String toString() {
		return "AgrupacionOficial:" + super.toString() + ", Puntos Obtenidos=" + getPuntosObtenidos();
	}

}
