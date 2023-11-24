package praktikum5;

public abstract class Hewan { //kunci untuk menambahkan function kosong
	protected static String name; //di setiap kls harus ada name
	protected abstract void eat(); // function kosong, agar nanti bisa di isi
}

class Cat extends Hewan {
	String warna;
	int umur;
	public void identitas(String namaKucing, String warnaKucing, int umurKucing) {
		Cat.name = namaKucing;
		warna = warnaKucing;
		umur = umurKucing;
	}
	public void eat() {
		System.out.println(Cat.name+" Makan Bold ");
	}
	String ambilNama() {
		return Cat.name;
	}
	String ambilWarna() {
		return warna;
	}
	int ambilUmur() {
		return umur;
	}
}