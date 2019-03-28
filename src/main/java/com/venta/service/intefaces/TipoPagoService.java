package com.venta.service.intefaces;

import java.util.List;

import com.venta.entities.TipoPago;

public interface TipoPagoService {

	TipoPago save(TipoPago tipoPago);
	
	List<TipoPago> findAll();
}
