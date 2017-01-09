package com.calculatrice.service;

import com.calculatrice.beans.Resultat;

/**
 * Calcule le résultat d'une operation
 */
public class Calculator {

	public int calcule(Resultat resultat) throws Exception {
		int result = 0;
		
		switch (resultat.getOperation()) {
		case ADDITION:
			result = resultat.getOperande1() + resultat.getOperande2();
			break;
			
		case SOUSTRACTION:
			result = resultat.getOperande1() - resultat.getOperande2();
			break;
			
		case MULTIPLICATION:
			result = resultat.getOperande1() * resultat.getOperande2();
			break;
			
		case DIVISION:
			if (resultat.getOperande2() == 0) {
				throw new Exception("Impossible de diviser par 0");
			}
			result = resultat.getOperande1() / resultat.getOperande2();
			break;

		default:
			break;
		}
		
		resultat.setResultat(result);
		
		return result;
	}
}
