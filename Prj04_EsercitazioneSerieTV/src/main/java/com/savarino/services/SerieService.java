package com.savarino.services;

import java.util.List;

import com.savarino.entities.SerieTV;

public interface SerieService {

	List<SerieTV> getSerie();
	List<SerieTV> getSerieByGenere(String genere);
	
	SerieTV getSerieById(int id);
	SerieTV addSerie(SerieTV s);
	
	SerieTV updateSerie(SerieTV s);
	
	void deleteSerie(SerieTV s); 
	void deleteSerie(int id); 
}
