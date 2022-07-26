/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sekolah;

/**
 *
 * @author Fahmi Hakim
 */
public class Matrix {
    public static void main(String[] args) {
        
        int a  = 17;
        int b = 8;
        int n = 7;
        int nilaiSaatIni = a;
        int total = a;
        
        for(int i = 0; i < 5 ; i++){
            for (int j = 0; j < i; j++){
                System.out.print(nilaiSaatIni+ "\t");
                nilaiSaatIni += b;
                total += nilaiSaatIni;
                
            }
            System.out.println();
        }
        for(int o = 0; o < 5; o ++){
            for(int p = 0; p < 0; p ++ ){
                System.out.print(nilaiSaatIni+ "\t");
                nilaiSaatIni += b;
                total += nilaiSaatIni;
        }
            System.out.println();
        }
        total += nilaiSaatIni;
        System.out.println("Jumlah Deret Aritmatikanya adalah " + total);
    }
              
    }
    

