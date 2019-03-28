package com.venta.service.intefaces;

import java.util.List;

import com.venta.entities.Distrito;

public interface DistritoService {

	List<Distrito> getDistritoByCodDptoAndCodProv(String codDpto, String codProv); 
}
