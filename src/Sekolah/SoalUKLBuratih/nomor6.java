/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sekolah.SoalUKLBuratih;

/**
 *
 * @author Fahmi Hakim
 */
public class nomor6 {
    public static void main(String[] args) {
        
        int[][] a ={{2,3},{3,1}},b = {{5},{1}},hasil = {{0},{0}}; 
        
       System.out.println("Hasil Dari Perkalian (axb) :");
        for(int i =0;i<2;i++){
            for(int j=0;j<1;j++){
                for(int k=0;k<2;k++){
                    hasil[i][j]=hasil[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        
        //Hasil
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                System.out.print(hasil[i][j]);
            }
            System.out.println();
        }
    }
    
}
