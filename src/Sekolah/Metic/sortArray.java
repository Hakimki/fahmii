/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sekolah.Metic;

/**
 *
 * @author Fahmi Hakim
 */
public class sortArray {
  public static void main(String[] args){
      int angka[] = {3, 60, 35, 2, 45, 320, 5};
      int swipe;
      for(int i = 0; i <angka.length; i++){
          for(int j = i+1;j <angka.length;j++){
              if(angka[i] > angka[j] ){
                  swipe = angka[i];
                  angka[i] = angka[j];
                  angka[j] = swipe;
                  
              }
          }
          
          System.out.println(angka[i]);
      
  }
      
      }
    
  }

