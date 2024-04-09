package com.savarino.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "test")
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTest;
	
	private String titoloTest;
	private String dataTest;
	
	@ManyToMany
    @JoinTable(
        name = "domandatest",
        joinColumns = @JoinColumn(name = "idTest"),
        inverseJoinColumns = @JoinColumn(name = "idDomanda")
    )
    private Set<Domanda> domande = new HashSet<>();
	
	public int getIdTest() {
		return idTest;
	}
	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}
	public String getTitoloTest() {
		return titoloTest;
	}
	public void setTitoloTest(String titoloTest) {
		this.titoloTest = titoloTest;
	}
	public String getDataTest() {
		return dataTest;
	}
	public void setDataTest(String dataTest) {
		this.dataTest = dataTest;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Test [titoloTest=");
		builder.append(titoloTest);
		builder.append(", dataTest=");
		builder.append(dataTest);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
