/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL1;

/**
 *
 * @author Fahmi Hakim
 */
public class UKL4 {
    public static void main(String[] args) {
        System.out.println("Latihan Soal 4a");
        // deklarasi variabel
        int Awal = 5;
        int beda = 5;
        int sukuSaatIni;
        
        for(int a=0;a<=4;a++){// untuk membuat pola angka kebawah
            for(int b=0;b<a;b++){// untuk membuat pola angka kesamping
                sukuSaatIni = Awal;
                Awal += beda;
                System.out.print(sukuSaatIni+" ");// menampilkan nilai berikutnya dan membuat space diantara angka
            }
            System.out.println("");// untuk mengakhiri baris dan membuat baris baru
        }
    }
    
}
    
    

