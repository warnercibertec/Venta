package com.venta.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entities.Marca;
import com.venta.entities.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {

	List<Modelo> findByMarca(Marca marca);
}