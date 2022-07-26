/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalUKL29;

/**
 *
 * @author Fahmi Hakim
 */
public class Loop1 {
    public static void main(String [] args){
        int a = 7;
        int b = 5;
        int x;
        int total = 0;
        
        for(int i = 7; i <= 15; i++){
            x = a+(i-1)*b;
            total += x;
            System.out.println("nilai ke " + i + " adalah " + x);
            
            
        }
        System.out.println("\n total: " + total);
    }
    
}
