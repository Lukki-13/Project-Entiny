package de.lukki13.entiny.script.datatypes;

import java.util.HashMap;

import de.lukki13.entiny.script.datatypes.entities.EntinyEntity;

public class Datatypes {
	
	//Standard Datatypes
	private HashMap<String, Boolean> bool = new HashMap<>();
	private HashMap<String, Double> doub = new HashMap<>();
	private HashMap<String, Integer> inti = new HashMap<>();
	private HashMap<String, String> string = new HashMap<>();
	
	//Entity Data
	private HashMap<String, EntinyEntity> entity = new HashMap<>();

	// Getter Methods
	
	public HashMap<String, Boolean> getBool() {
		return bool;
	}

	public HashMap<String, Double> getDoub() {
		return doub;
	}

	public HashMap<String, Integer> getInti() {
		return inti;
	}

	public HashMap<String, String> getString() {
		return string;
	}

	public HashMap<String, EntinyEntity> getEntity() {
		return entity;
	}

}
