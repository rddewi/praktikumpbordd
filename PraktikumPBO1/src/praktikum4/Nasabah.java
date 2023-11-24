package praktikum4;

public class Nasabah {
	//nama nya di pecah2 dulu 
	public String namaDepan;
	public String namaBelakang;
	public Tabungan tabungan;
	
	//untuk menampung nama nasabahnya
	public Nasabah(String namaDepan, String namaBelakang) {
		this.namaDepan = namaDepan; //pake this karena biar ga sama 
		this.namaBelakang = namaBelakang;
	}
	public String getnamaDepan() {
		return namaDepan;
	}
	public String getnamaBelakang() {
		return namaBelakang;
	}
	public Tabungan getTabungan() {
		return tabungan;
	}
	public void setTabungan(Tabungan tabunagn) {
		this.tabungan = tabungan;
	}
}
