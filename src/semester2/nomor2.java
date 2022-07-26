/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester2;

import java.io.*;

/**
 *
 * @author Fahmi Hakim
 */
public class nomor2 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double hasilfahrenheit, hasilkelvin, hasilreamur;
        double celcius = 78;

        System.out.print("Masukan Suhu Dalam Celcius  : ");
        System.out.println("");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Reamur");
        System.out.print("Masukan Pilihan :");
        int pilih = Integer.parseInt(input.readLine());
        System.out.println("");

        switch (pilih) {
            case 1: 
                hasilfahrenheit = (celcius * 9 / 5) + 32;
                System.out.println(celcius + " Celcius = " + hasilfahrenheit + " Fahrenheit");
                break;
            case 2:
                hasilkelvin = celcius + 273.15;
                System.out.println(celcius + " Celcius = " + hasilkelvin + " Kelvin");
                break;
            case 3:
                hasilreamur = celcius * 4 / 5;
                System.out.println(celcius + " Celcius = " + hasilreamur + " Reamur");
                break;
            default:
                System.out.println("Pilihan yg anda masukan salah");
                break;
        }
    }

}
