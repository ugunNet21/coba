/*
Nama	: Gugun Gunawan
NPM		: 1842413
Tugas 	: 1.2 Java 2 OOP Menghitung Nilai
*/

import java.util.Scanner;
public class nilai1
{

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan Nilai pertama");
    double pertama =  input.nextDouble();
    System.out.println("Masukan Nilai kedua");
    double kedua =  input.nextDouble();
    System.out.println("Masukan Nilai ke Tiga");
    double ketiga =  input.nextDouble();
    
    double nilai=(pertama+kedua+ketiga);
    if (nilai >= 60)
    {
        System.out.println("Nilai Rata-Rata Anda"+nilai+":D !!");
    }
    else
        {
        System.out.println("Nilai Rata-Rata Anda"+nilai+":-( !!");
        }
    }

}
