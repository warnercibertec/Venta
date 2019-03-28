package com.venta.service.intefaces;

import java.util.List;

import com.venta.entities.Area;

public interface AreaService {

    Area save(Area area);
	
    List<Area> findAll();
}
