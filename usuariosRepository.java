package com.org.app.proyecto.carlos.repositorys;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.org.app.proyecto.carlos.entitys.usuario;


@Repository
public interface usuariosRepository extends JpaRepository<usuario, Long>{
	
	@Query(name="SELECT * FROM usuarios", nativeQuery = true)
	List<usuario> findUsuarios();
	

}
