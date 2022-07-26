/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sekolah.SoalUKLBuratih;

/**
 *
 * @author Fahmi Hakim
 */
public class nomor4 {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 3;
        int kolom = 5;
        int un = a;
        int sn = a;

        System.out.println("Deret Aritmatika : ");
        for (int i = 0; i < kolom - 1; i++) {
            for (int j = 0; j < kolom - i; j++) {
                System.out.print(un + " ");
                un += b;
                sn += un;
            }
            if (i < kolom - 2) {
                System.out.println("");
            }
        }
        for (int i = 0; i <= kolom; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(un + " ");
                un += b;
                sn += un;
            }
            System.out.println("");
        }
        sn -= un;
        System.out.println("jumlah Deret = " + sn);
    }
        }
        
        
            
       
    

    

        
