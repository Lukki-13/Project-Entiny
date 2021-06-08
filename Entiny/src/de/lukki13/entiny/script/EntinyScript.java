package de.lukki13.entiny.script;

import java.io.FileNotFoundException;

import de.lukki13.entiny.script.datatypes.Datatypes;
import de.lukki13.entiny.script.exceptions.EntinyParseException;

public class EntinyScript {
	
	private Datatypes data;
	
	public EntinyScript(String file) {
		try {
			EntinyParser parser = new EntinyParser(file);
			
			data = parser.parse();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EntinyParseException e) {
			e.printStackTrace();
		}
	}

	public Datatypes getData() {
		return data;
	}
	
}