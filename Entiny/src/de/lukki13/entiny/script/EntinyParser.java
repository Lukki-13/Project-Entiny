package de.lukki13.entiny.script;

import java.io.FileNotFoundException;

import de.lukki13.entiny.script.datatypes.Datatypes;
import de.lukki13.entiny.script.exceptions.EntinyParseException;
import de.lukki13.entiny.script.statements.Statement;

public class EntinyParser {
	
	public EntinyParser(String filename) throws FileNotFoundException{
		
	}
	
	public Datatypes parse() throws EntinyParseException {
		Datatypes data = new Datatypes();
		
		return data;
	}
	
	private void parseStatement() throws EntinyParseException {
		Statement statement;
		
		return statement;
	}
	
	private void parseAssignment() throws EntinyParseException {
		
	}
	
}