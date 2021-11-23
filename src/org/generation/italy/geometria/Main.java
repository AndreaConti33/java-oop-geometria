package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserire valore in centimetri per la base del rettangolo: ");
		int base = scanner.nextInt();

		System.out.print("Inserire un valore in centimetri per l'altezza del rettangolo: ");
		int altezza = scanner.nextInt();

		Rettangolo mioRettangolo = new Rettangolo(base, altezza);

		mioRettangolo.calcoloArea();
		System.out.println("L'area del tuo rettangolo è di: " + mioRettangolo.calcoloArea() + " centimetri quadrati.");
		mioRettangolo.CalcoloPerimetro();
		System.out.println("Il perimetro del tuo rettangolo è di: " + mioRettangolo.CalcoloPerimetro() + " centimetri.");

		scanner.close();
	}

}
