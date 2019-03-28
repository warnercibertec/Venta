package com.venta.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.venta.dao.MarcaRepository;
import com.venta.entities.Marca;
import com.venta.service.intefaces.MarcaService;

@Service
@Transactional(readOnly = true)
public class MarcaServiceImpl implements MarcaService {

	private static final Logger logger = LoggerFactory
			.getLogger(MarcaServiceImpl.class);

	@Autowired
	private MarcaRepository repository; 
	
	@Override
	public List<Marca> findAll() {
		logger.debug("MarcaServiceImpl.findAll");
		return repository.findAll();
	}

	@Override
	public Marca findOne(Long id) {
		return repository.findOne(id);
	}

}
