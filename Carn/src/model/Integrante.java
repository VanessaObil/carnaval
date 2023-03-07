package model;

public class Integrante {
	
	private static Integer numParticipante = 0;
	private Integer num;
	private String nombre;
	private Integer edad;
	private String localidad;
	
	public Integrante() {
		numParticipante++;
		setNum(numParticipante);
	}

	public Integer getNum() {
		return num;
	}

	private void setNum(Integer num) {
		this.num = num;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		if(edad>=18) {
			this.edad = edad;	
		}else {
			this.edad = 18;
		}
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Integrante: "
				+ "Num=" + getNum()
				+ ", Nombre=" + getNombre() 
				+ ", Edad=" + getEdad()
				+ ", Localidad=" + getLocalidad();
	}
	
	
}
