package com.org.app.proyecto.carlos.repositorys;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.org.app.proyecto.carlos.entitys.carro;

@Repository
public interface Carrorepository extends JpaRepository<carro, Long> {

	@Query(name="SELECT * FROM carros",nativeQuery = true)
	List<carro> findCarro();
}
