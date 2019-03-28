package com.venta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entities.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
