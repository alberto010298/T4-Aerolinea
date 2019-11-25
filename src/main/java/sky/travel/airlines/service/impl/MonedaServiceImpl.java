package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Moneda;
import sky.travel.airlines.model.repository.MonedaRepository;
import sky.travel.airlines.service.MonedaService;

@Service
public class MonedaServiceImpl implements MonedaService{

	@Autowired
	private MonedaRepository monedaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Moneda> findAll() throws Exception {
		return monedaRepository.findAll();
	}

	@Override
	public Optional<Moneda> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Moneda save(Moneda entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Moneda update(Moneda entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
