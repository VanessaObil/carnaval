package model;

/**
 * <h1>La clase Integrante se utiliza para crear objetos de tipo Integrante</h1>
 * 
 * @version 1-2023
 * @author Vanessa
 * @since 08-03-2023
 */
public class Integrante {
	/**
	 * Atributo n&uacute;mero de participantes de Integrante
	 */
	private static Integer numParticipante = 0;
	/**
	 * Atrubuto numero de Integrante
	 */
	private Integer num;
	/**
	 * Atributo nombre de Integrane
	 */
	private String nombre;
	/**
	 * Atributo edad de Integrante
	 */
	private Integer edad;
	/**
	 * Atributo localidad de Integrante
	 */
	private String localidad;

	/**
	 * Constructor sin par&aacute;metros Se incrementa en uno, al n&uacute;mero de
	 * participantes de Integrante Se le asigna un n&uacute;mero de participantes
	 */
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

	/**
	 * Comprueba si es mayor de edad
	 * 
	 * @param edad <i> Edad de Integrante</i>
	 */
	public void setEdad(Integer edad) {
		if (edad >= 18) {
			this.edad = edad;
		} else {
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
		return "Integrante: " + "Num=" + getNum() + ", Nombre=" + getNombre() + ", Edad=" + getEdad() + ", Localidad="
				+ getLocalidad();
	}

}
