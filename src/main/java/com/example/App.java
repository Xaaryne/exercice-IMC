package com.example;

public class App {

    public static void main(String[] args) {
        Patient patient = new Patient(74.5, 1.75);
        System.out.println(patient.caractéristiques());
        System.out.println("IMC exact : " + patient.calculerIMC());
        Patient autrePatient = new Patient(-2.0, 4.5);
        System.out.println(autrePatient.caractéristiques());
    }

}
