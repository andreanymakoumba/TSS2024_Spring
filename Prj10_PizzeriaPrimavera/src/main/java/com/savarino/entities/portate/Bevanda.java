package com.savarino.entities.portate;

import com.savarino.entities.Portata;

public class Bevanda extends Portata{

	public Bevanda() {
		this.setTipo(this.getClass().toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bevanda [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
