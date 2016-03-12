/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Hendra
 */
public class Ruangan{
	private PasienInap[] daftarPasien = new PasienInap[4];
	private PasienInap daftarPasienn;
	private Kelas namakelas;
	private int noKamar;
	private int jumlahpasien;
	
	public Ruangan(int nokam, Kelas nmkel) 
	{
		this.noKamar = nokam;
		this.namakelas = nmkel;
	}
	
	public void tambahPasienInap(Pasien pasien, Dokter dokter)
	{
		daftarPasien[jumlahpasien] = new PasienInap(pasien,dokter);
		daftarPasien[jumlahpasien].setPasien(pasien);
		daftarPasien[jumlahpasien].setDokter(dokter);
		jumlahpasien++;
	}
	
	public PasienInap getPasienInapbyindex(int n)
	{
		return daftarPasien[n];
	}
	
	public PasienInap getPasienInapbyid(int id)
	{
		if (daftarPasien[0].getPasien() != null)
		{
			for (int i=0;i<5;i++)
			{
				if (daftarPasien[i].getPasien().getIdPasien() == id)
				{
					daftarPasienn = daftarPasien[i];
				}
				
				else
				{
					daftarPasienn = null;;
				}
			}
		}
		
		else
		{
			System.out.println ("Pasien Tidak Terdaftar");
		}
		
		return daftarPasienn;
	}
	
	public void RemovePasienInap(int id)
	{
		if (daftarPasien[0].getPasien() != null)
		{
			for (int i=0;i<5;i++)
			{
				if (daftarPasien[i].getPasien().getIdPasien() == id)
				{
					daftarPasien[i] = null;
				}
				
				else
				{
					System.out.println ("Pasien Tidak Terdaftar");
				}
			}
		}
		
		else
		{
			System.out.println ("Pasien Tidak Terdaftar");
		}
	}
	
	public int getJumlahPasien()
	{
		return jumlahpasien;
	}
}