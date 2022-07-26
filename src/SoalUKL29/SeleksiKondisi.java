/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalUKL29;
import java.util.Scanner;

public class SeleksiKondisi {
    {
        
    }

        
         static int golongan[][] =
            {
                    {5000, 8000, 8000, 10500, 10500},
                    {6000, 9000, 9000, 12000, 12000},
                    {9000, 14000, 14000, 18500, 18500},
                    {6000, 9000, 9000, 12000, 12000},
                    {5500, 8500, 8500, 11500, 11500},
                    {5500, 8500, 8500, 11500, 11500},
                    {9000, 14000, 14000, 18500, 18500},
                    {6000, 8500, 8500, 11500, 11500},
                    {3000, 5000, 5000, 6500, 6500},
            };
    static String kotaasal, kotatujuan;
    static int tipe;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Asal : ");
        kotaasal = scan.nextLine();

        System.out.println("Masukkan Tujuan: ");
        kotatujuan = scan.nextLine();

        System.out.println("Masukkan Golongan (1 - 5)");
        tipe = Integer.parseInt(scan.nextLine());
        int harga = getData(kotaasal, kotatujuan, tipe);

        System.out.println("Harga = " + harga);
    }

    public static int getData(String kotaasal, String kotatujuan, int tipe) {
        int harga = 0;
        tipe = tipe - 1;
        if (kotaasal.equalsIgnoreCase("Dupak")) {
            if (kotatujuan.equalsIgnoreCase("Waru")) {
                harga = golongan[0][tipe];
            }
        }
        if (kotaasal.equalsIgnoreCase("Waru")) {
            if (kotatujuan.equalsIgnoreCase("Sidoarjo")) {
                harga = golongan[1][tipe];
            } else if (kotatujuan.equalsIgnoreCase("Porong")) {
                harga = golongan[2][tipe];
            }
        } else if (kotaasal.equalsIgnoreCase("Sidoarjo")) {
            if (kotatujuan.equalsIgnoreCase("Waru")) {
                harga = golongan[3][tipe];
            } else if (kotatujuan.equalsIgnoreCase("Porong")) {
                harga = golongan[4][tipe];
            }
        } else if (kotaasal.equalsIgnoreCase("Porong")) {
            if (kotatujuan.equalsIgnoreCase("Sidoarjo")) {
                harga = golongan[5][tipe];
            } else if (kotatujuan.equalsIgnoreCase("Waru")) {
                harga = golongan[6][tipe];
            } else if (kotatujuan.equalsIgnoreCase("Kejapanan")) {
                harga = golongan[7][tipe];
            }
        } else if (kotaasal.equalsIgnoreCase("Kejapanan")) {
            if (kotatujuan.equalsIgnoreCase("Gempol")) {
                harga = golongan[8][tipe];
            }
        }

        return harga;
    }
    }
    
