package com.calculatrice.beans;

/**
 * Enumere les differentes operations
 */
public enum Operation {
	ADDITION("+"), 
	SOUSTRACTION("-"), 
	MULTIPLICATION("*"), 
	DIVISION("/");
	
	private String value;
	
	private Operation(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
