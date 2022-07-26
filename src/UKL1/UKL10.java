/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL1;

/**
 *
 * @author Fahmi Hakim
 */
public class UKL10 {
    
    public static void main(String [] args){
         System.out.println("Latihan Soal 3");
        System.out.println("Deret Aritmatikanya adalah : "); 
        
        int awal = 8;
        int beda = 10;
        int jumlahDeret = 0;
        int updatenilai;
        int n= 5;
        int sukuSaatIni = awal; 
        //deklarasi variabel

        for(int i = 0; i<4;i++){ //untuk membentuk pola baris kebawah
            for(int a =0; a<5;a++){ // untuk membentuk pola kolom kesamping
                //operator elemen matriks
                updatenilai = n;
                n=awal+(n-1)*beda;
                jumlahDeret += updatenilai;
                System.out.print("  " +updatenilai);//menampilan nilai berikutnya 
               
            }
            System.out.println("  ");//untuk mengakhiri baris
        }
        System.out.println(" Total Jumlah Deret Aritmatika : "+jumlahDeret);// menampilkan total jumlah deret aritmatika
} 
    }
    

