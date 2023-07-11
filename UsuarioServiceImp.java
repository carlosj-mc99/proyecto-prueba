package com.org.app.proyecto.carlos.service.serviceImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.org.app.proyecto.carlos.entitys.usuario;
import com.org.app.proyecto.carlos.repositorys.usuariosRepository;
import com.org.app.proyecto.carlos.service.UsuarioService;

public class UsuarioServiceImp  implements UsuarioService{
	
	@Autowired
	public usuariosRepository usuariosRepository;

	@Override
	public List<usuario> findUsuarios() {
		List<usuario> usuarios=usuariosRepository.findUsuarios();
		return usuarios;
	}

}
