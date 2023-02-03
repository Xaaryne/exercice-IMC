package com.example;

public class Patient {
    double taille = 0;
    double poids = 0;
    double IMC = 0;

    public Patient(double kg, double m) {
        if (kg > 0 & m > 0) {
            taille = m;
            poids = kg;
            IMC = calculerIMC();
        }

    }

    public String caractéristiques() {

        return ("patient : " + poids + "kg pour " + taille + "m (IMC = " + IMC + ")");
    }

    public double calculerIMC() {
        return poids / Math.pow(taille, 2);

    }

}
