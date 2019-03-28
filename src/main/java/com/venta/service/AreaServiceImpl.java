package com.venta.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.venta.dao.AreaRepository;
import com.venta.entities.Area;
import com.venta.service.intefaces.AreaService;

@Service
@Transactional(readOnly = true)
public class AreaServiceImpl implements AreaService {

	private static final Logger logger = LoggerFactory.getLogger(AreaServiceImpl.class);

	@Autowired
	private AreaRepository repository;

	@Override
	public Area save(Area area) {
		logger.debug("AreaServiceImpl.save");
		return repository.save(area);
	}

	@Override
	public List<Area> findAll() {
		logger.debug("AreaServiceImpl.findAll");
		return repository.findAll();
	}

}
