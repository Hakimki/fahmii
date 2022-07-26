/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL1;

/**
 *
 * @author Fahmi Hakim
 */
public class SoalDeretAritmatika {
    public static void main(String [] args){
        
        int sukuPertama = 4;
        int selisih = 2;
        int sukuAwal = 3;
        int sukuAkhir = 84;
        int sukuSaatini = sukuPertama;
        int totalAritmatika = 0;
        
        for(int i = 1; i < sukuAkhir; i++){
            totalAritmatika += sukuSaatini;
            sukuSaatini += selisih;
            
            if(i >= sukuAwal){
                System.out.println("Nilai dari suku ke -" + i + " adalah " + sukuSaatini);
            }
            
           
          }
         System.out.println("Jumlah Deret Aritmatika = " + totalAritmatika);
    }
    
}
