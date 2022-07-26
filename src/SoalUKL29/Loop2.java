/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalUKL29;

/**
 *
 * @author Fahmi Hakim
 */
public class Loop2 {

    public static void main(String[] args) {
        int a = 2,
                b = 3,
                n = 24,
                total = 0,
                baris = 0;
        
        for (int i = 0; i < n; i++) {
            a += b;
            total += a;
            System.out.print(a + "\t");
            baris++;
            if (baris == 4) {
                System.out.println();
                baris = 0;
            }
        }
        System.out.println("\nJumlah Deret adalah : " + total);

    }

}
