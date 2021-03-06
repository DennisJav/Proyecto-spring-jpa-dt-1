package ec.edu.modelo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity // anotacion de jpa persistent
//para que sepa donde es la tabla en la bas de datos
@Table(name = "guardia") // Es absolutamente necesario cuando la tabla tiene un nombre diferente
//no hace diferenciacion la mayuscula

//PARA VARIOS NAMED QUERY
@NamedQueries({
	@NamedQuery(name = "Guardia.buscarPorApellido", query = "select g from Guardia g where g.apellido = :valor"), // JAVA Persisstence
	@NamedQuery(name = "Guardia.buscarPorApellido1", query = "select g from Guardia g where g.apellido = :valor") // JAVA Persisstence
})
//Declarar los Query de Guardia cuando es namedQuery
@NamedQuery(name = "Guardia.buscarPorApellido2", query = "select g from Guardia g where g.apellido = :valor") // JAVA Persisstence
//  en el name es el estandar esa escritura
// en query en JPQL

public class Guardia {
	// tambien se debe dar metadata a los atributos

	@Id // para indicar que es la primary key
	@GeneratedValue // para generar el valor de id se debe crear la secuencia => hibernate_sequence
	@Column(name = "id") // a cada atributo
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "edificio")
	private String edificio;

	// metodos set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	@Override
	public String toString() {
		return "Guardia [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
