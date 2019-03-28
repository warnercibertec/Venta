package com.venta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entities.NotaPedido;

public interface NotaPedidoRepository extends JpaRepository<NotaPedido, Long> {

}
