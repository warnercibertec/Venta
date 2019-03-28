package com.venta.service.intefaces;

import java.util.List;

import com.venta.entities.NotaPedidoProducto;

public interface NotaPedidoProductoService {

	NotaPedidoProducto save(NotaPedidoProducto notaPedidoProducto);
	
	List<NotaPedidoProducto> save(Iterable<NotaPedidoProducto> iterable);
}
