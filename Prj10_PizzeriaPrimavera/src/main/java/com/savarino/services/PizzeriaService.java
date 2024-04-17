package com.savarino.services;

import java.util.List;

import com.savarino.entities.Cliente;
import com.savarino.entities.Ordine;
import com.savarino.entities.Portata;
import com.savarino.entities.Tavolo;
import com.savarino.entities.portate.*;

public interface PizzeriaService {
	List<Pizza> getPizze();
	List<Bevanda> getBevanda();
	List<Dolce> getDolci();
	List<Altro> getAltro();
	
	List<Cliente> getClienti();
	List<Ordine> getOrdini(); //da implementare
	List<Portata> getPortate();
	List<Tavolo> getTavoli();
	
	//By ID
	
	Pizza getPizzeById(int id);
	Bevanda getBevandaById(int id);
	Dolce getDolciById(int id);
	Altro getAltroById(int id);
	
	Cliente getClientiById(int id);
	Ordine getOrdiniById(int id); //da implementare
	Portata getPortateById(int id);
	Tavolo getTavoliById(int id);
	
	//-------
	
	Pizza addPizza(Pizza p);
	Bevanda addBevanda(Bevanda b);
	Dolce addDolce(Dolce d);
	Altro addAltro(Altro a);
	
	Cliente addCliente(Cliente c);
	Ordine addOrdine(Ordine o);
	Portata addPortata(Portata p);
	Tavolo addTavolo(Tavolo t);
}
