package com.venta.service.intefaces;

import java.util.List;

import com.venta.entities.Area;
import com.venta.entities.Cargo;

public interface CargoService {
	
	List<Cargo> findByArea(Area area);
	
}
