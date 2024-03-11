package com.savarino.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.savarino.entities.SerieTV;
import com.savarino.services.SerieService;

@Controller
public class SerieCtrl2 {
	
	@Autowired
	private SerieService service;
	
//	@GetMapping("serie")
//	@ResponseBody
//	public String getSerie() {
//		return "serie"; //con controller devi ritornare una pagina in template
//	}
	
	@GetMapping("serie")
	public String getSerie(Model m) {
		m.addAttribute("titolo", "Serie TV");
		m.addAttribute("elencoSerie", service.getSerie());
		return "serie"; 
	}
	
	@GetMapping("serie/{id}")
	public String getSerieById(@PathVariable int id, Model m) {
		m.addAttribute("titolo", "Serie TV");
		m.addAttribute("elencoSerie", service.getSerieById(id));
		return "serie"; 
	}
	
	@PostMapping("serie")
	public String addSerie(SerieTV s) {
		service.addSerie(s);
		return "redirect:serie";
	}
	
	
	@GetMapping("fumetti")
	public String getFumetti(Model m) {
		m.addAttribute("titolo", "Fumetti");
		return "fumetti"; 
	}

}
