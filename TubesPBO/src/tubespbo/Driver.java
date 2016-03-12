/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Adzan
 */
public class Driver {
    public static void main(String[] args){
		
		Dokter[] dok = new Dokter[3];
		dok[0] = new Dokter("Adzan",28,"Pria","Bekasi",123456,"THT");
		dok[1] = new Dokter("Kusuma",27,"Pria","Bali",123457,"Bedah");
		dok[2] = new Dokter("Vicha",26,"Wanita","Sragen",123458,"Kandungan");
		
		Pasien[] pas = new Pasien[6];
		pas[0] = new Pasien("Nugraha",19,"Pria","Bandung",1111,"19 Februari 2016","AB");
		pas[1] = new Pasien("Hendra",18,"Pria","Yogyakarta",1112,"22 Maret 2016","A");
		pas[2] = new Pasien("Octavia",17,"Wanita","Solo",1113,"04 April 2016","O");
		pas[3] = new Pasien("Tama",22,"Wanita","Klaten",1114,"18 April 2016","B");
		pas[4] = new Pasien("Wijaya",18,"Pria","Medan",1115,"02 Mei 2016","AB");
		pas[5] = new Pasien("Ichsan",24,"Pria","Jakarta",1116,"25 Juni 2016","A");
		
		Kelas[] kel = new Kelas[4];
		kel[0] = new Kelas("Anggrek");
		kel[1] = new Kelas("Bakau");
		kel[2] = new Kelas("Cendana");
		kel[3] = new Kelas("Duri");
		
		Ruangan[] ru = new Ruangan[12];
		ru[0] = new Ruangan(1,kel[0]);
		ru[1] = new Ruangan(2,kel[0]);
		ru[2] = new Ruangan(3,kel[0]);
		ru[3] = new Ruangan(4,kel[1]);
		ru[4] = new Ruangan(5,kel[1]);
		ru[5] = new Ruangan(6,kel[1]);
		ru[6] = new Ruangan(7,kel[2]);
		ru[7] = new Ruangan(8,kel[2]);
		ru[8] = new Ruangan(9,kel[2]);
		ru[9] = new Ruangan(10,kel[3]);
		ru[10] = new Ruangan(11,kel[3]);
		ru[11] = new Ruangan(12,kel[3]);
		
		ru[0].tambahPasienInap(pas[0],dok[0]);
		ru[1].tambahPasienInap(pas[1],dok[0]);
		ru[1].tambahPasienInap(pas[2],dok[1]);
		ru[2].tambahPasienInap(pas[3],dok[1]);
		ru[2].tambahPasienInap(pas[4],dok[2]);
		ru[3].tambahPasienInap(pas[5],dok[2]);
}
}
