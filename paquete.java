package com.org.app.proyecto.carlos.entitys;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="paquetes")
@NamedNativeQuery(name="paquete.findAll",query="SELECT p FROM p ")
@Data
public class paquete implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_PAQ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaq;
	
	@Column(name="NOMBRE_PAQ")
	private String nombrePaq;

	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Column(name="COSTO")
	private long costo;
	
	@OneToOne//sirve para hacer la relacion de one to one con la clase entity usuario(un paquete puede tener un solo ussuario)
	@JoinColumn(name="ID_USUARIO")
	private usuario usuario;
	
	@OneToOne//sirve para hacer la relacion de one to one con la clase entity carro (un paquete puede tener un solo carro)
	@JoinColumn(name="ID_CARRO")
	private carro carro;
	
	@OneToOne//sirve para hacer la relacion de one to one con la clase entity seguro (un paquete puede tener un solo seguro)
	@JoinColumn(name="ID_SEGURO")
	private seguro seguro;

}
