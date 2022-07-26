/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKLsemester1;

/**
 *
 * @author Fahmi Hakim
 */
public class soal2b {
    public static void main(String[] args) {
        int a[][] = {{3}, {5}};
        int b[][] = {{5}, {3}};
        int baris_a = a.length;
        int kolom_a = a[0].length;

        int baris_b = b.length;
        int kolom_b = b[0].length;
        int h;
        System.out.println("Hasil AxB");
        //proses perhitungan
        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_b; j++) {
                h = 0;
                for (int k = 0; k < kolom_a; k++) {
                    h = a[i][k] * b[k][j];
                }
                System.out.println(h);
            }
        }
    }
}
        

                      
            
        
        
         
    
    

