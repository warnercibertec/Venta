package com.venta.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venta.entities.Credito;

public interface CreditoRepository extends JpaRepository<Credito, Long> {

}
