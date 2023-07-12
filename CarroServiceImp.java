package com.org.app.proyecto.carlos.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.app.proyecto.carlos.entitys.carro;
import com.org.app.proyecto.carlos.repositorys.Carrorepository;
import com.org.app.proyecto.carlos.service.ICarroService;

public class CarroServiceImp implements ICarroService {

	@Autowired
	private Carrorepository Carrorepository;
	
	@Override
	public List<carro> findCarro() {
		
		List<carro> carros=Carrorepository.findCarro();
		return carros;
	}

}
