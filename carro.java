package com.org.app.proyecto.carlos.entitys;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="carros")
@NamedNativeQuery(name="carro.finAll",query="SELECT c FROM c ")
@Data
public class carro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_CARRO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCarro;
	
	@Column(name="NOMBRE_CARRO")
	private String nombreCarro;

	@Column(name="COLOR")
	private String color;
	
	@Column(name="MARCA")
	private String marca;
	
	@Column (name="MODELO")
	private String modelo;
	
	@Column (name="PLACA")
	private String placa;
	
	@Column(name="ANIO")
	private Integer anio;


}
