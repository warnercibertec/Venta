package com.venta.service.intefaces;

import java.util.List;

import com.venta.entities.Marca;

public interface MarcaService {
	
	List<Marca> findAll();
	
	Marca findOne(Long id);
}
