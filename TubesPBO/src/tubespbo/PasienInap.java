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
public class PasienInap {
	private Pasien pasien;
	private Dokter dokter;
	private String[] diagnosa;
	private int jumlahdiagnosa;
	private String tglMasuk;
	
	public PasienInap (Pasien pasien, Dokter dokter, String tglMasuk)
	{
		this.pasien = pasien;
		this.dokter = dokter;
		this.tglMasuk = tglMasuk;
	}
	
	public void addDiagnosa(String gejala)
	{
		diagnosa[jumlahdiagnosa] = gejala;
		jumlahdiagnosa++;
	}
	
	public String getDiagnosa(int n)
	{
		return diagnosa[n];
	}
	
	public void deleteDiagnosa(int n)
	{
		diagnosa[n] = null;
	}
	
	public void setPasien(Pasien pasien)
	{
		this.pasien = pasien;
	}
	
	public Pasien getPasien()
	{
		return pasien;
	}
	
	public void setDokter(Dokter dokter)
	{
		this.dokter = dokter;
	}
	
	public Dokter getDokter()
	{
		return dokter;
	}
	
	public String getTglMasuk()
	{
		return tglMasuk;
	}
}
