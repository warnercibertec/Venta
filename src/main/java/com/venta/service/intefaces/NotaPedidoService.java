package com.venta.service.intefaces;

import com.venta.entities.NotaPedido;

public interface NotaPedidoService {

	NotaPedido save(NotaPedido notaPedido);
	
	NotaPedido findOne(Long id);
}
