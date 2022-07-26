/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentasi;
import java.util.*;

/**
 *
 * @author Fahmi Hakim
 */
public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int nomor [] = new int [11];
            int ArrayTerbesar = nomor[0];
            

            System.out.println("nomor ke 0");
            nomor [0] = input.nextInt(); 
            System.out.println("nomor ke 1");
            nomor [1] = input.nextInt();
            System.out.println("nomor ke 2");
            nomor [2] = input.nextInt();
            System.out.println("nomor ke 3");
            nomor [3] = input.nextInt();
            System.out.println("nomor ke 4");
            nomor [4] = input.nextInt();
            System.out.println("nomor ke 5");
            nomor [5] = input.nextInt();
            System.out.println("nomor ke 6");
            nomor [6] = input.nextInt();
            System.out.println("nomor ke 7");
            nomor [7] = input.nextInt();
            System.out.println("nomor ke 8");
            nomor [8] = input.nextInt();
            System.out.println("nomor ke 9");
            nomor [9 ] = input.nextInt();
            System.out.println("nomor ke 10");
            nomor [10] = input.nextInt();
            for(int i = 0;i<nomor.length;i++){
                if(ArrayTerbesar < nomor[i]){
                    ArrayTerbesar = nomor[i];

                }
               
                
            }
            System.out.println(ArrayTerbesar + " : Array terbesar");
    }
}
    

