package com.venta.service.intefaces;

import java.util.List;

import com.venta.entities.Marca;
import com.venta.entities.Modelo;

public interface ModeloService {

	List<Modelo> findByMarca(Marca marca);
	
}
