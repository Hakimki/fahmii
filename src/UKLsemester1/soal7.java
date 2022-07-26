/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKLsemester1;
import java.util.*;
/**
 *
 * @author Fahmi Hakim
 */
public class soal7 {

     static int hitung(int tipe, int hari, int lamaHari) {
        int harga = 0;
        if (tipe == 1 || tipe == 2) {
            switch (hari) {
                case 1:
                    harga += 915000 * lamaHari;
                    break;
                case 2:
                    harga += 1025000 * lamaHari;
                    break;
                case 3:
                    harga += 1225000 * lamaHari;
                    break;
                default:
                    break;
            }
        } else if (tipe == 3 || tipe == 4) {
            switch (hari) {
                case 1:
                    harga += 575000 * lamaHari;
                    break;
                case 2:
                    harga += 695000 * lamaHari;
                    break;
                case 3:
                    harga += 895000 * lamaHari;
                    break;
                default:
                    break;
            }
        } else if (tipe == 5 || tipe == 6) {
            switch (hari) {
                case 1:
                    harga += 575000 * lamaHari;
                    break;
                case 2:
                    harga += 715000 * lamaHari;
                    break;
                case 3:
                    harga += 915000 * lamaHari;
                    break;
                default:
                    break;
            }
        } else if (tipe == 7 || tipe == 8 || tipe == 9) {
            switch (hari) {
                case 1:
                    harga += 495000 * lamaHari;
                    break;
                case 2:
                    harga += 575000 * lamaHari;
                    break;
                case 3:
                    harga += 755000 * lamaHari;
                    break;
                default:
                    break;
            }
        } else if (tipe == 10) {
            switch (hari) {
                case 1:
                    harga += 25000 * lamaHari;
                    break;
                case 2:
                    harga += 25000 * lamaHari;
                    break;
                case 3:
                    harga += 35000 * lamaHari;
                    break;
                default:
                    break;
            }
        }
        return harga;
    }
     public static void main(String[] args) {
        
    
    int id[] = {1, 2, 3, 4};
    String nama[] = {"Ali", "Budi", "Dani", "Umar"};

    Scanner input = new Scanner(System.in);

    System.out.print (
    "Masukkan ID pelanggan : ");
        int idp = input.nextInt();

    System.out.println (

    "Pilih Jenis Cottage :");
    System.out.println (

    "1.Duku");
    System.out.println (

    "2.Jeruk");
    System.out.println (

    "3.Alpukat");
    System.out.println (

    "4.Jambu Air");
    System.out.println (

    "5.Durian");
    System.out.println (

    "6.Melon");
    System.out.println (

    "7.Belimbing");
    System.out.println (

    "8.Mangga");
    System.out.println (

    "9.Kedondong");
    System.out.println (

    "10.Barrack");;
    System.out.print (
    "Pilihan Anda : ");
        int tipe = input.nextInt();

    System.out.println (

    "Masukkan Jenis Hari :");
    System.out.println (

    "1.Weekday");
    System.out.println (

    "2.Weekend");
    System.out.println (

    "3.Holiday");
    System.out.print (
    "Pilihan Anda : ");
        int hari = input.nextInt();

    System.out.print (
    "Jumlah Hari :");
        int lamaHari = input.nextInt();

    int totalHarga = hitung(tipe, hari, lamaHari);

    System.out.println (

    "");
    System.out.println (

    "ID : " + idp);
    System.out.println (

    "Nama pelanggan : " + nama[idp - 1]);
    System.out.println (

    "Jumlah Hari : " + lamaHari);
    System.out.println (

    "Tipe Cottage : " + tipe);
    System.out.println (

"Total Biaya : " + totalHarga);
     }
}
