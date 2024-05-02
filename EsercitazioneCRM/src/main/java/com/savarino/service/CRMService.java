package com.savarino.service;

import java.util.List;

import com.savarino.entities.Appuntamenti;
import com.savarino.entities.Cliente;
import com.savarino.entities.Note_Cliente;
import com.savarino.entities.Opportunita;
import com.savarino.entities.Servizi_Consulenza;

public interface CRMService {

	//Cliente
	List<Cliente> getClienti();
	Cliente getClienteById(int id);
	Cliente addCliente(Cliente c);
	Cliente updateCliente(Cliente c);
	void deleteCliente(Cliente c);
	
	//Appuntamenti
	List<Appuntamenti> getAppuntamenti();
	
	//Note Cliente
	List<Note_Cliente> getNoteCliente();
	
	//Opportunita
	List<Opportunita> getOpportunita();
	
	//Servizi Consulenza
	List<Servizi_Consulenza> getServiziConsulenza();
}
