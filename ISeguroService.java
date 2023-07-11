package com.org.app.proyecto.carlos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.app.proyecto.carlos.entitys.seguro;


@Service
public interface ISeguroService {
	
	List<seguro> findSeguros();

}
