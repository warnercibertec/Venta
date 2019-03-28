package com.venta.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.venta.dao.TipoClienteRepository;
import com.venta.entities.TipoCliente;
import com.venta.service.intefaces.TipoClienteService;

@Service
@Transactional(readOnly = true)
public class TipoClienteServiceImpl implements TipoClienteService {

	private static final Logger logger = LoggerFactory
			.getLogger(TipoClienteServiceImpl.class);

	@Autowired
	private TipoClienteRepository repository;
	
	@Override
	public List<TipoCliente> getListTipoClientes() {
		logger.debug("TipoClienteServiceImpl.getListTipoClientes()");
		return repository.findAll();
	}

}
