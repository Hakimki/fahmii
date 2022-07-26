/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL1;

/**
 *
 * @author Fahmi Hakim
 */
public class UKL6 {
    public static void main(String[] args) {
        int matriksA [][] = {{6,3},{4,8}};
        int matriksB [][] = {{1},{2}};
        int matriksC [][] = new int [matriksA.length][matriksB[0].length];
        
        //matriksA[ba][ka]*matriksB[bb][kb]=matriksC
        for(int i=0;i<matriksA.length;i++){//baris a
            for(int j=0;j<matriksB[0].length;j++){//kolom b
                for(int k=0;k<matriksB.length;k++){
                    matriksC[i][j] += matriksA[i][k] * matriksB[k][j];
                    
                    
                }
                System.out.print(matriksC[i][j]+ " ");
            }
            System.out.println(" ");
    }
    }
    
    }
    

