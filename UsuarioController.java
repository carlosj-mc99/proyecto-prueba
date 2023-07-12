package com.org.app.proyecto.carlos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.app.proyecto.carlos.entitys.usuario;
import com.org.app.proyecto.carlos.service.UsuarioService;

@RestController(value="/usuario")
public class UsuarioController {

	
	@Autowired
	private UsuarioService  UsuarioService;
	
	@GetMapping(value="/listaUsuarios")
	public List<usuario> findAll(){
		
		return UsuarioService.findUsuarios();
	}
}
