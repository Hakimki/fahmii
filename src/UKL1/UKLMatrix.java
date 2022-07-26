/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL1;

/**
 *
 * @author Fahmi Hakim
 */
public class UKLMatrix {

    public static void main(String[] args) {

        int a[][] = {{-7, 5}, {4, 8}};
        int b[][] = {{1, 1}, {-4, 9}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] - b[i][j] + "\t");

            }

            System.out.println();

        }

    }
}
