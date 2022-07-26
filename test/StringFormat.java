/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fahmi Hakim
 */
public class StringFormat {
    
    public static void main(String[] args) {
        
        String nama = "yanto";
        int umur = 16;
        
        //menggunakan cara print format
        System.out.printf("Nama saya adalah %s, umur %s adalah %d ", nama,nama,umur);
        //%s untuk konversi String
        //%d untuk konversi integer
        //%f untuk konversi float
        //%c untuk konversi char
        //%b untuk konversi boolean
        
        System.out.println("\n\nArgument Index$");
        //umur yanto berapa ?, umur yanto 16 dan dia masih umur 16 tahun
        System.out.printf("\nUmur %1$s berapa ?, umur %1$s %2$d dan dia masih umur %2$d tahun ", nama, umur);
        
        System.out.println("\n\nFlags");
        //untuk menampilkan tanda plus minus
        int int1 = 3;
        int int2 = 6;
        int hasil = int1 + int2;
        System.out.printf("%d+%d = %+d", int1,int2,hasil);
    }
    
}
