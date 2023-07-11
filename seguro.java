package com.org.app.proyecto.carlos.entitys;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="seguros")
@NamedNativeQuery(name="Seguro.findAll",query="SELECT s FROM s ")
@Data
public class seguro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_SEGURO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSeguro;
	
	@Column(name="NOMBRE_SEGURO")
	private String nombreSeguro;

	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name="COSTO")
	private Integer costo;
	
	
	
	

}
