package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Viaggio;
import com.savarino.repos.ViaggioDAO;

@Service
public class ViaggioServiceImpl implements ViaggioService {

	@Autowired
	ViaggioDAO dao;
	
	@Override
	public List<Viaggio> getAll() {
		return dao.findAll();
	}

	@Override
	public Viaggio getViaggioById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void deleteViaggio(Viaggio v) {
		dao.delete(v);
	}

	@Override
	public Viaggio updateViaggio(Viaggio v) {
		return dao.save(v);
	}

	@Override
	public Viaggio addViaggio(Viaggio v) {
		return dao.save(v);
	}

	
	
}
