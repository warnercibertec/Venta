package com.venta.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.venta.dao.DepartamentoRepository;
import com.venta.entities.Departamento;
import com.venta.service.intefaces.DepartamentoService;

@Service
@Transactional(readOnly = true)
public class DepartamentoServiceImpl implements DepartamentoService {

	private static final Logger logger = LoggerFactory
			.getLogger(DepartamentoServiceImpl.class);
	
	@Autowired
	private DepartamentoRepository repository;
	
	@Override
	public List<Departamento> getDepartamentos() {
		logger.debug("DepartamentoServiceImpl.getDepartamentos():");
		return repository.findAll();
	}

}
