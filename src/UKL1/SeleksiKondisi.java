/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL1;
import java.util.Scanner;

/**
 *
 * @author Fahmi Hakim
 */
public class SeleksiKondisi {
    
   
        
        static int hitung(int nilai){
        
            int bayar = 2000;
            nilai -= 10;
            
            //10m kedua
            if (nilai> 10){
                bayar += 3000;
                nilai -= 10;
            }else{
                bayar += 3000*nilai;
                nilai = 0;
            }
            //10m kegiga
            if (nilai > 10){
                bayar+= 4000;
                nilai -= 10;
            }
            else{
                bayar+= 4000*nilai;
                nilai -= 10;
            }
            //10m selanjutnya
            if (nilai > 10){
                bayar=+ 3000 *nilai;
            }
            return bayar;
        }
        public static void main (String [] args){
            int id[] = {1, 2, 3, 4, 5};//id pelanggan
            String namaPelanggan []= {"Ali", "Budi", "Dani", "Edi", "Umar"};//Nama Pelanggan
            
            Scanner input = new Scanner (System.in);
            System.out.println("Masukkan id pelanggan");
            String idln = input.nextLine();
        }
    }
    
