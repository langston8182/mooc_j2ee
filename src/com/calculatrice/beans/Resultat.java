package com.calculatrice.beans;

/**
 * Classe contenant les operandes ainsi que le resultat de l'operation
 */
public class Resultat {

	private int operande1;
	private int operande2;
	private Operation operation;
	private int resultat;
	
	public int getOperande1() {
		return operande1;
	}
	public void setOperande1(int operande1) {
		this.operande1 = operande1;
	}
	public int getOperande2() {
		return operande2;
	}
	public void setOperande2(int operande2) {
		this.operande2 = operande2;
	}
	public Operation getOperation() {
		return operation;
	}
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public int getResultat() {
		return resultat;
	}
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
}
