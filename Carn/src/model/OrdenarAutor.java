package model;

import java.util.Comparator;

public class OrdenarAutor implements Comparator<Agrupacion>{

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		return o2.getAutor().compareTo(o2.getAutor());
	}
}
