/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sekolah.SoalUKLBuratih;
import java.util.*;

/**
 *
 * @author Fahmi Hakim
 */
public class nomor7 {

    

    static int hitung(int nilai) {
        int bayar = 20000;
        nilai = nilai - 10;

        //pengitungan 10 kedua
        if (nilai > 10) {
            bayar = bayar + 120000;
            nilai = nilai - 10;
        } else {
            bayar = bayar + 6000 * nilai;
            nilai = 0;
        }

        //pengitungan 10 ketiga
        if (nilai > 10) {
            bayar = bayar + 140000;
            nilai = nilai - 10;
        } else {
            bayar = bayar + 7000 * nilai;
            nilai = 0;
        }

        //pengitungan selanjutnya
        if (nilai > 10) {
            bayar = bayar + 8000 * nilai;
        }

        return bayar;
    }

    public static void main(String[] args) {
        int id[] = {1, 2, 3, 4, 5};//id pelanggan
        String namaPelanggan[] = {"Dina", "Kiki", "Robby", "Fatwa", "Ulya"};
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan id pelanggan");
        String idIn = myObj.nextLine();
        int iId = Integer.valueOf(idIn);

        System.out.println("Masukkan jumlah tagihan");
        String tagihan = myObj.nextLine();
        int iTagihan = Integer.valueOf(tagihan);

        if (iTagihan < 10) {
            iTagihan = 20000;
        } else {
            iTagihan = hitung(iTagihan);
        }

        iTagihan = iTagihan + 20000;

        System.out.println("================Print Out Tagihan=================");
        System.out.println("ID\t:" + idIn);
        System.out.println("Nama\t:" + namaPelanggan[iId - 1]);
        System.out.println("Tagihan\t:Rp." + iTagihan + ",-");
    
    }
}

