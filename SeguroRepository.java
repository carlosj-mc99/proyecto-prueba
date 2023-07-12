package com.org.app.proyecto.carlos.repositorys;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.org.app.proyecto.carlos.entitys.seguro;

@Repository
public interface SeguroRepository extends JpaRepository<seguro, Long> {
	
	@Query(name="getSeguros",nativeQuery = true)
	List<seguro> findSeguros();

}
