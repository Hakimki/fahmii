/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalUKL29;

/**
 *
 * @author Fahmi Hakim
 */
public class Matrix {

    public static void main(String[] args) {

        int a = 12;
        int b = 7;
        int x;
        int total = 0;
        
        for (int i = 17; i < 27; i++){
            x = a + (i-1)*b;
            total += x;
            System.out.println("Nilai ke " + i + "adalah " + x);
            
        }
        
        System.out.println("Total :" + total);
    }
}
