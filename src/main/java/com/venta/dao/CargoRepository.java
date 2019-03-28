package com.venta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entities.Area;
import com.venta.entities.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

	List<Cargo> findByArea(Area area);
	
}
