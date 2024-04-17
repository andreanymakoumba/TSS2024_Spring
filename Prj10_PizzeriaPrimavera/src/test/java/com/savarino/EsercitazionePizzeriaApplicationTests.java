package com.savarino;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.savarino.entities.Cliente;
import com.savarino.entities.Ordine;
import com.savarino.entities.Persona;
import com.savarino.entities.Portata;
import com.savarino.entities.Tavolo;
import com.savarino.entities.portate.Pizza;
import com.savarino.services.PizzeriaService;

@SpringBootTest
class EsercitazionePizzeriaApplicationTests {

	@Autowired
	private PizzeriaService service;
	
	
	
	@Test
	void getPizze() {
		service.getPizze().stream().forEach(p->System.out.println(p.getNome()));
	}

	@Test
	void getClienti() {
		List<Cliente> clienti = service.getClienti();
		assertFalse(clienti == null);
	}
	
	@Test
	void addOrdine() {
		Ordine o = new Ordine();
		o.setAsporto(false);
		Cliente c = new Cliente();
		
		Pizza p1 = service.getPizze().get(0);
		Pizza p2 = service.getPizze().get(1);
		Pizza p3 = service.getPizze().get(2);
		o.setPortate(List.of(p1,p2,p3));
		
		Tavolo t = new Tavolo();
		t.setNumero(1);
		t.setPosti(4);
		t.setPersone(List.of(new Persona(),new Persona(),new Persona(),new Persona()));
		
		
		c.setUsername("pippo");
		c.setPassword("12345");
		c.setPhone("1234567");
//		o.setCliente(c);
		o.setTavolo(t);
		o.setDataOrdine(LocalDate.now());
		o.setOraOrdine(LocalTime.now());
		
		System.out.println(o.print());
		
	}
	
	//@Test
	void addCliente() {
		Cliente c = new Cliente();
		c.setUsername("pippo");
		c.setPassword("12345");
		c.setPhone("1234567");
		Cliente cliente = service.addCliente(c);
		assertEquals(cliente.getUsername(), "pippo");
	}
}
