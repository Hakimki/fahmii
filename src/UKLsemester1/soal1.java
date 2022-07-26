/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKLsemester1;

/**
 *
 * @author Fahmi Hakim
 */
public class soal1 {
    public static void main(String[] args) {
        
        int a = 17;
        int b = 5;
        int x;
        int total = 0;
        
        for(int i = 8; i <= 23; i++){
            x = a + (i -1) * b;
            total += x;
            System.out.println("Suku ke -" + i + " adalah " + x);
            
        }
        System.out.println("Total :" + total);
    }
    
}
