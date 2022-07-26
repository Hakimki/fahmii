/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL1;

/**
 *
 * @author Fahmi Hakim
 */
public class LatihanUKL1 {


        /**
         * int a = 5; int b = 5; int n = 3; int n2 = 10; int total = a; int tot
         * = a;
         *
         *
         * for(int i = 1; i < n2; i++){
         * a += b;
         * total = total + b;
         * tot = tot - total;
         *
         *
         *
         * if(i >= n){ System.out.println("Nilai dari " + i + " adalah " + a); }
         * tot = tot - total;
         *
         * }
         * System.out.println("Total :" + tot);*
         */
        public static void main(String[] args) {
        int a = 18;
        int b = 4;
        int n = 2;
        int n2 = 17;
        int u = a;
        int s = a;
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 0; i < n2; i++) {
           
            u = u + b;
            s = s + u;
            if(i >= n){
                System.out.println("Nilai ke " + i + " adalah " + u);
            }
            System.out.println();
        }
        s = s - u;
        System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
    }
}
        
