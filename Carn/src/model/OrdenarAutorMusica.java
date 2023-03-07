package model;

import java.util.Comparator;

public class OrdenarAutorMusica implements Comparator<Agrupacion>{

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		return o1.getAutorMusica().compareTo(o2.getAutorMusica());
	}
	
	public boolean equals(Agrupacion o1, Agrupacion o2) {
		return o1.getAutorLetras().equals(o2.getAutorLetras());
	}

}
