package com.venta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entities.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Long> {

}
