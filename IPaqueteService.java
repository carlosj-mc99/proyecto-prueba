package com.org.app.proyecto.carlos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.app.proyecto.carlos.entitys.paquete;


@Service
public interface IPaqueteService {
	
	List<paquete> findPaquete();

}
