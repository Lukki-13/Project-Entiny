package de.lukki13.entiny.script.exceptions;

public class EntinyParseException extends Exception{

	private static final long serialVersionUID = -6967183820492227094L;
	
	private String awaited;
	private int line;
	
	public EntinyParseException(String awaited, int line) {
		super("ENTINY: '"+awaited+"' awaited! in line: "+line);
		this.awaited = awaited;
		this.line = line;
	}

	public String getAwaited() {
		return awaited;
	}

	public void setAwaited(String awaited) {
		this.awaited = awaited;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}
	
}