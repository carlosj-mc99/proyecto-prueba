package com.org.app.proyecto.carlos.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.org.app.proyecto.carlos.entitys.paquete;

@Repository
public interface PaqueteRepository extends JpaRepository<paquete, Long> {
	
	@Query(name="getPaquetes", nativeQuery = true)
	List<paquete> findPaquete();

}
