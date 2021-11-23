package org.generation.italy.geometria;

public class Rettangolo {

	// Variabili
	int base;
	int altezza;

	Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	// Metodo per calcolo area
	int calcoloArea() {
		int area = base * altezza;
		return area;
	}

	// Metodo per calcolo perimetro
	int CalcoloPerimetro() {
		int perimetro = (base * 2) + (altezza * 2);
		return perimetro;
	}
}
