package com.org.app.proyecto.carlos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.app.proyecto.carlos.entitys.usuario;

@Service
public interface UsuarioService {
	
	List<usuario> findUsuarios();

}
