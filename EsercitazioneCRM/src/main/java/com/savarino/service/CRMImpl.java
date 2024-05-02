package com.savarino.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Appuntamenti;
import com.savarino.entities.Cliente;
import com.savarino.entities.Note_Cliente;
import com.savarino.entities.Opportunita;
import com.savarino.entities.Servizi_Consulenza;
import com.savarino.repos.AppuntamentiDAO;
import com.savarino.repos.ClienteDAO;
import com.savarino.repos.Note_ClienteDAO;
import com.savarino.repos.OpportunitaDAO;
import com.savarino.repos.Servizi_ConsulenzaDAO;

@Service
public class CRMImpl implements CRMService {

	@Autowired
	ClienteDAO daoCl;
	
	@Autowired
	AppuntamentiDAO daoAp;
	
	@Autowired
	Note_ClienteDAO daoNC;
	
	@Autowired
	OpportunitaDAO daoOp;
	
	@Autowired
	Servizi_ConsulenzaDAO daoSC;
	
	//Cliente
	@Override
	public List<Cliente> getClienti() {
		return daoCl.findAll();
	}

	@Override
	public Cliente getClienteById(int id) {
		return daoCl.findById(id).get();
	}
	
	@Override
	public Cliente addCliente(Cliente c) {
		return daoCl.save(c);
	}
	
	@Override
	public Cliente updateCliente(Cliente c) {
		return daoCl.save(c);
	}
	
	@Override
	public void deleteCliente(Cliente c) {
		daoCl.delete(c);
	}

	//Appuntamenti
	@Override
	public List<Appuntamenti> getAppuntamenti() {
		return daoAp.findAll();
	}

	@Override
	public List<Note_Cliente> getNoteCliente() {
		return daoNC.findAll();
	}

	@Override
	public List<Opportunita> getOpportunita() {
		return daoOp.findAll();
	}

	@Override
	public List<Servizi_Consulenza> getServiziConsulenza() {
		return daoSC.findAll();
	}


}
