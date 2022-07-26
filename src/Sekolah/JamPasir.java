/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sekolah;
import java.util.Scanner;
/**
 *
 * @author Fahmi Hakim
 */
public class JamPasir {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

    int jumlah = input.nextInt();
    polaJamPasirTerbalik(jumlah);
    PolaJamPasir(jumlah);
  }

  public static void PolaJamPasir(int tinggi){
    for(int i = 2; i <= tinggi; i++){
      for(int j = 1; j <= (tinggi*2)-1; j++){
        if(Math.abs(tinggi-j)<i){
          System.out.print( '0' );
        }else{
          System.out.print( ' ' );
        }
      }
      System.out.println();
    }
  }

  public static void polaJamPasirTerbalik(int tinggi){
    for(int i = tinggi; i>=1;i--){
       for(int j=1;j<=(tinggi*2)-1;j++){
        if(Math.abs(tinggi-j)<i){
          System.out.print( '0' );
        }else{
          System.out.print( ' ' );
        }
      }
      System.out.println();
    }
  }
    }
    

