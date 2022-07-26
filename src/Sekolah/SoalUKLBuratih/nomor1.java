/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sekolah.SoalUKLBuratih;

/**
 *
 * @author Fahmi Hakim
 */
public class nomor1 {

    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int n = 7;
        int n2 = 15;
        int u = a;
        int s = a;
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 1; i <= n2; i++) {
            u = u + b;
            s = s + u;
            if(i >= n){
                System.out.println("Nilai ke " + i + " adalah " + u);
            }
        }
        s = s - u;
        System.out.println("Jumlah Deret Aritmatikanya adalah " + s)
    
;}
}
