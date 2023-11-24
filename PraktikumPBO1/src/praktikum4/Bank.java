package praktikum4;

public class Bank {
	private Nasabah[] nasabah;//Nasabah[] didefinisikan sebagai array menampung beberaapa data nama, privat krn setiap nama itu unik
	private int jumlahNasabah;
	
	public Bank() {
		nasabah = new Nasabah[4];
		jumlahNasabah = 0;
	}
	public void tambahNasabah(String namaDepan, String namaBelakang) {
		int i = jumlahNasabah++;
		nasabah[i] = new Nasabah(namaDepan, namaBelakang);
	}
	public int getjumlahNasabah() {
		return jumlahNasabah;
	}
	public Nasabah getnasabah(int indeks) {
		return nasabah[indeks];
	}
	
}
