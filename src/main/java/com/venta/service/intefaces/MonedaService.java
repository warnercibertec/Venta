package com.venta.service.intefaces;

import java.util.List;

import com.venta.entities.Moneda;

public interface MonedaService {

	Moneda save(Moneda moneda);
	
	List<Moneda> findAll();
	
}
