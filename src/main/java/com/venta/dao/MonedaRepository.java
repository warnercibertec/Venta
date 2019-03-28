package com.venta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entities.Moneda;

public interface MonedaRepository extends JpaRepository<Moneda, Long> {

}
