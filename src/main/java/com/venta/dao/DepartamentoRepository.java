package com.venta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entities.Departamento;

public interface DepartamentoRepository extends
		JpaRepository<Departamento, Long> {

}
