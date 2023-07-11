package com.org.app.proyecto.carlos.service.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.app.proyecto.carlos.entitys.seguro;
import com.org.app.proyecto.carlos.repositorys.SeguroRepository;
import com.org.app.proyecto.carlos.service.ISeguroService;

public class SeguroServiceImp implements ISeguroService {
	
	@Autowired
	private SeguroRepository SeguroRepository;

	@Override
	public List<seguro> findSeguros() {
		List<seguro> seguros= SeguroRepository.findSeguros();
		return seguros;
	}

}
