package com.savarino.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "domanda")
public class Domanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDomanda;
	
	private String testoDomanda;
	private String rispostaEsatta;
	private int punteggioDomanda;
	
	@ManyToMany(mappedBy = "domande")
    private Set<Test> tests = new HashSet<>();
	
	public int getIdDomanda() {
		return idDomanda;
	}
	public void setIdDomanda(int idDomanda) {
		this.idDomanda = idDomanda;
	}
	public String getTestoDomanda() {
		return testoDomanda;
	}
	public void setTestoDomanda(String testoDomanda) {
		this.testoDomanda = testoDomanda;
	}
	public String getRispostaEsatta() {
		return rispostaEsatta;
	}
	public void setRispostaEsatta(String rispostaEsatta) {
		this.rispostaEsatta = rispostaEsatta;
	}
	public int getPunteggioDomanda() {
		return punteggioDomanda;
	}
	public void setPunteggioDomanda(int punteggioDomanda) {
		this.punteggioDomanda = punteggioDomanda;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Domanda [idDomanda=");
		builder.append(idDomanda);
		builder.append(", testoDomanda=");
		builder.append(testoDomanda);
		builder.append(", rispostaEsatta=");
		builder.append(rispostaEsatta);
		builder.append(", punteggioDomanda=");
		builder.append(punteggioDomanda);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
