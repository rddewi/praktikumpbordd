package praktikum4;

public class Tabungan { //class tabungan
	public int saldo; //variabel
	public Tabungan(int initsaldo) { //inisialisasi
		saldo = initsaldo;
	}
	public boolean ambilUang(int jumlah) {
		if(saldo - jumlah < 0) { //perulangan if 
			return false;
		} else {
			saldo = saldo - jumlah;
			return true;
		}
	}
	public int simpanUang(int jumlah) {
		return saldo = saldo + jumlah; //perhitungan dari saldo yang dimiliki dan jumlah
	}
	public int getSaldo() { //getter
		return saldo;
	}
}