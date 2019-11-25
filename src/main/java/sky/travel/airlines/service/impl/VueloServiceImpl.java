package sky.travel.airlines.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sky.travel.airlines.model.entity.Vuelo;
import sky.travel.airlines.model.repository.CabinaRepository;
import sky.travel.airlines.model.repository.VueloRepository;
import sky.travel.airlines.service.VueloService;

@Service
public class VueloServiceImpl implements VueloService{

	@Autowired
	private VueloRepository vueloRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Vuelo> findAll() throws Exception {
		return vueloRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Vuelo> findById(String id) throws Exception {
		return vueloRepository.findById(id);
	}

	@Transactional
	@Override
	public Vuelo save(Vuelo entity) throws Exception {
		return vueloRepository.save(entity);
	}

	@Transactional
	@Override
	public Vuelo update(Vuelo entity) throws Exception {
		return vueloRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		vueloRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		vueloRepository.deleteAll();
	}

}
