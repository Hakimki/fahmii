/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sekolah.SoalUKLBuratih;

/**
 *
 * @author Fahmi Hakim
 */
public class nomor3 {
    public static void main(String[] args) {
        
        int a = 6;
        int b = 8;
        int awal = 6;
        int u = a;
        int total = a;
        
        for(int i=0;i<6;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a + " ");
                a+=b;
                total+=a;
                
            }
            System.out.println();
        }   
        total = total -a;
        System.out.println("Sum of all : " + total);
    }
    }
            
    

