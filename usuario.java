package com.org.app.proyecto.carlos.entitys;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="usuarios")
@NamedNativeQuery(name="usuario.findAll",query="SELECT U FROM U ")
@Data
public class usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@Column(name="NOMBRE")
	private String nombre;

	@Column(name="AP_P")
	private String apellP;
	
	@Column(name="AP_M")
	private String apellM;
	
	@Column (name="FH_NACIMIENTO")
	private LocalDateTime fhNacimiento;
	
	@Column (name="CORREO")
	private String correo;
	
	@Column(name="PWD")
	private String pwd;
	
	@OneToOne//sirve para hacer la relacion de one to one con la clase entity paquete(un usuario puede tener un solo paquete)
	@JoinColumn(name="ID_PAQ")
	private paquete paquete;
	
	@OneToOne//sirve para hacer la relacion de one to one con la clase entity carro(un usuario puede tener un solo carro)
	@JoinColumn(name="ID_CARRO")
	private carro carro;
	
	@OneToOne//sirve para hacer la relacion de one to one con la clase entity seguro (un paquete puede tener un solo seguro)
	@JoinColumn(name="ID_SEGURO")
	private seguro seguro;
	
}
