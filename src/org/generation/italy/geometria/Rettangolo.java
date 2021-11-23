package org.generation.italy.geometria;

import java.util.Scanner;

public class Rettangolo {
	Scanner scanner = new Scanner(System.in);

	// Variabili
	int base;
	int altezza;

	// Metodo richiesta "base" all'utente
	void baseUtente() {
		System.out.print("Inserire valore in centimetri per la base del rettangolo: ");
		base = scanner.nextInt();
	}

	// Metodo richiesta "altezza" all'utente
	void altezzaUtente() {
		System.out.print("Inserire un valore in centimetri per l'altezza del rettangolo: ");
		altezza = scanner.nextInt();
	}

	// Metodo per calcolo area
	int calcoloArea() {
		int area = base * altezza;
		System.out.println("L'area del tuo rettangolo è di: " + area + " centimetri quadrati.");
		return area;
	}

	// Metodo per calcolo perimetro
	int CalcoloPerimetro() {
		int perimetro = (base * 2) + (altezza * 2);
		System.out.println("Il perimetro del tuo rettangolo è di: " + perimetro + " centimetri.");
		return perimetro;
	}
}
