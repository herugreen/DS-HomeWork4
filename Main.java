package com.javaprogram;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek kalkulator
        Kalkulator kalkulator = new Kalkulator();

        // Input dua angka dari pengguna
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Menampilkan menu operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penambahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("5. Modulus (%)");

        // Memilih operasi
        System.out.print("Masukkan nomor operasi: ");
        int pilihan = scanner.nextInt();

        // Melakukan operasi sesuai pilihan pengguna
        double hasil = 0;
        switch (pilihan) {
            case 1:
                hasil = kalkulator.tambah(angka1, angka2);
                break;
            case 2:
                hasil = kalkulator.kurang(angka1, angka2);
                break;
            case 3:
                hasil = kalkulator.kali(angka1, angka2);
                break;
            case 4:
                hasil = kalkulator.bagi(angka1, angka2);
                break;
            case 5:
                hasil = kalkulator.modulus(angka1, angka2);
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
                return;
        }

        // Menampilkan hasil
        System.out.println("Hasil: " + hasil);

        // Menutup scanner
        scanner.close();
    }
}
