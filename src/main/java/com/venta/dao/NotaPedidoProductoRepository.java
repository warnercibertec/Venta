package com.venta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entities.NotaPedidoProducto;
import com.venta.entities.NotaPedidoProductoId;

public interface NotaPedidoProductoRepository extends JpaRepository<NotaPedidoProducto, NotaPedidoProductoId> {

}
