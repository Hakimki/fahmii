/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalUKL29;

/**
 *
 * @author Fahmi Hakim
 */
public class Loop3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int n = 10;
        int total = 0;
        
        
        //segitiga sama kaki
        for(int i=1;i<=4;i++){
           for(int j=1;j<=i;j++){
                a+=b;
                total+=a;
                System.out.print(a + " ");
            }
            System.out.println();
        }        
        //Model B
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                a+=b;
                total+=a;
               System.out.print(a + " ");
            }
            System.out.println();
        }     
        System.out.println("total : " + total);
        
        
        
        
        
        
        
        //segitiga setengah 2
        
        for(int i = 1; i <= 4; i ++){
            for(int j = 4; j>= i; j--){
                a+=b;
                total += a;
                System.out.print(a + "\t");
            }
            
            System.out.println();
        }
        for ( int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                a+=b;
                total += a;
                System.out.print(a + "\t");
            }
            System.out.println("");
    }
        System.out.println("total :" + total);
    
}
}
