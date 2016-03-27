/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;
import tubespbo.Application;
import tubespbo.Dokter;
import tubespbo.Kelas;
import tubespbo.PasienInap;
import tubespbo.Pasien;
import tubespbo.Ruangan;


/**
 *
 * @author Adzan
 */
public class ViewConsole {

    private Application app;
    private Scanner s1 = new Scanner(System.in);
    private Scanner s2 = new Scanner(System.in);

    public ViewConsole(Application app) {
        this.app = app;
    }
    public void MainMenu() {
        int pil1 = 0;
        int pil2 = 0;
        while (pil1 != 5) {
            System.out.println();
            System.out.println("1. Data Dokter");
            System.out.println("2. Data Pasien");
            System.out.println("3. Data Ruangan");
            System.out.println("4. Data Kelas");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Pilih Menu : ");
            pil1 = s1.nextInt();
            switch (pil1) {
                case 1:
                    pil2 = 0;
                    while(pil2 != 4){
                    System.out.println();
                    System.out.println("-Data Dokter-");
                    System.out.println("1.Insert Dokter");
                    System.out.println("2.Search Dokter");
                    System.out.println("3.Delete Dokter");
                    System.out.println("4.Kembali");
                    System.out.println("Pilih :");
                    pil2 = s1.nextInt();
                    switch(pil2){
                        case 1:
                            System.out.println();
                            System.out.print("Masukkan Nama : ");
                            String namadok = s2.nextLine();
                            System.out.print("Masukkan Umur : ");
                            int umurdok = s1.nextInt();
                            System.out.print("Masukkan Jenis Kelamin : ");
                            String jenisKelamindok = s2.nextLine();
                            System.out.print("Masukkan Alamat : ");
                            String alamatdok = s2.nextLine();
                            System.out.print("Masukkan No SIP : ");
                            int noSip = s1.nextInt();
                            System.out.print("Masukkan Spesialis : ");
                            String spesialis = s2.nextLine();
                            app.insertDokter(namadok, umurdok, jenisKelamindok, alamatdok, noSip, spesialis);
                            break;
                        
                        case 2:
                            System.out.println();
                            System.out.print("Masukkan Index Dokter : ");
                            int id = s1.nextInt();
                            Dokter e = app.getDokter(id);
                            if (e != null) {
                                System.out.println("Nama = " + e.getNama());
                                System.out.println("Umur = " + e.getUmur());
                                System.out.println("Jenis Kelamin = " + e.getJenisKelamin());
                                System.out.println("Alamat = " + e.getAlamat());
                                System.out.println("NO SIP = " + e.getNoSip());
                                System.out.println("Spesialis = " + e.getSpesialis());
                            } 
                            else {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                         
                        case 3:
                            System.out.println();
                            System.out.print("Masukkan Indeks Dokter : ");
                            int j = s1.nextInt();
                            Dokter f = app.getDokter(j);
                            if (f != null) 
                            {
                                app.deleteDokter(j);
                                System.out.println("Data Dokter Berhasil Dihapus");
                            }
                            else {
                                System.out.println("Data Tidak Ditemukan");
                            }
                            break;
                        
                        case 4:
                            break;
                    
                    }
                    }
                    break;
}
