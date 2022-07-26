/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL1;

/**
 *
 * @author Fahmi Hakim
 */
public class iniLatihan {

    public static void main(String[] args) {
        /*Nilai suku pertama(a) adalah 10, Selisih antara nilai suku-suku yang berdekatan (b) adalah 10, tampilkan 
deret mulai suku ke 5 sampai ke 10, dan tampilkan jumlah deret tersebut*/
    int a = 10;
    int b = 10;
    int x;
    int total = 0;
    
    
    for(int i = 5; i < 11; i++){
        x = a + (i-1)*b;
        total += x;
        System.out.println("nilai ke " + i + " adalah " + x);
    }
        System.out.println("\n total :" + + total);
    
    }
   

}
