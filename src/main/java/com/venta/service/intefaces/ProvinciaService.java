package com.venta.service.intefaces;

import java.util.List;

import com.venta.entities.Provincia;

public interface ProvinciaService {

	List<Provincia> getProvinciaByCodDpto(String codDpto);
}
