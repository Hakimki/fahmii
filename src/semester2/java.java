

package semester2;

import java.util.Scanner;


/**
 *
 * @author Fahmi Hakim
 */
public class java {
    
    public static void main(String[] args){
        
       
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("======Program Mencari Rumus Permukaan Bola=========");
 
        float phi = 3.14f;
        float rusuk, luas, volume;
 
        System.out.println(" Luas dan Volume Bola \n");
 
        System.out.println(" Masukkan Rusuk : ");
        rusuk = userInput.nextFloat();
 
        luas = 4 * phi * rusuk * rusuk;
        System.out.println("\n Luas Bola   : " + luas);
    }
    
}
