package de.lukki13.entiny.script.statements;

public class Assignment<T> implements Statement {
	
	private String var;
	private T data;
	
	//Getters
	
	public String getVar() {
		return var;
	}

	public T getData() {
		return data;
	}

	//Overrides from Statement
	
	@Override
	public void eval() {
		
	}

}