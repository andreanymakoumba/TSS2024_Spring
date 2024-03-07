package com.serie.services;

import com.serie.entities.Serie;
import java.util.List;


public interface SerieService {
List<Serie> getSerie();
void addSerie (Serie s);
}
