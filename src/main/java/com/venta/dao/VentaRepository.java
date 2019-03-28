package com.venta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entities.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {

}
