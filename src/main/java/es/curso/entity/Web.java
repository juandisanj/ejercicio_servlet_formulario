package es.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Web {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="web_id")
	private Integer webId;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="url")
	private String url;
	
	@Column(name="descripcion")
	private String descripcion;
	
	public Web() {
	}

	public Web(String nombre, String url, String descripcion) {
		this.nombre = nombre;
		this.url = url;
		this.descripcion = descripcion;
	}

	public Integer getWebId() {
		return webId;
	}

	public void setWebId(Integer webId) {
		this.webId = webId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
