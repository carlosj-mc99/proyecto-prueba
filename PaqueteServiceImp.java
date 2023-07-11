package com.org.app.proyecto.carlos.service.serviceImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.org.app.proyecto.carlos.entitys.paquete;
import com.org.app.proyecto.carlos.repositorys.PaqueteRepository;
import com.org.app.proyecto.carlos.service.IPaqueteService;

public class PaqueteServiceImp implements IPaqueteService {
	
	
	@Autowired
	private PaqueteRepository PaqueteRepository;

	@Override
	public List<paquete> findPaquete() {

		List<paquete> paquetes=PaqueteRepository.findPaquete();
		return paquetes;
	}

}
