package com.javaprogram;

public class Kalkulator {
    // Metode untuk penambahan
    public double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }

    // Metode untuk pengurangan
    public double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }

    // Metode untuk perkalian
    public double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }

    // Metode untuk pembagian
    public double bagi(double angka1, double angka2) {
        if (angka2 != 0) {
            return angka1 / angka2;
        } else {
            System.out.println("Pembagian oleh nol tidak diizinkan.");
            return Double.NaN; // NaN (Not a Number) digunakan untuk menunjukkan hasil yang tidak valid
        }
    }

    // Metode untuk modulus
    public double modulus(double angka1, double angka2) {
        if (angka2 != 0) {
            return angka1 % angka2;
        } else {
            System.out.println("Modulus dengan nol tidak diizinkan.");
            return Double.NaN;
        }
    }
}
