package com.api_de_carros.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "auto")
public class Auto implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "color", nullable=false, length = 20)
	private String color;
	
	@Column(name = "cilindros", nullable=true, length = 10)
	private String cilindros;
	
	@Column(name = "numero_de_puertas", nullable=true)
	private Integer numero_de_puertas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCilindros() {
		return cilindros;
	}

	public void setCilindros(String cilindros) {
		this.cilindros = cilindros;
	}

	public Integer getNumero_de_puertas() {
		return numero_de_puertas;
	}

	public void setNumero_de_puertas(Integer numero_de_puertas) {
		this.numero_de_puertas = numero_de_puertas;
	}

	public Auto(Long id, String color, String cilindros, Integer numero_de_puertas) {
		super();
		this.id = id;
		this.color = color;
		this.cilindros = cilindros;
		this.numero_de_puertas = numero_de_puertas;
	}

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
