package praktikum1;
// pertemuan pertama materi ke 3 atau terakhir
import java.util.Scanner; //klo belum di pakai bakal ada garis kuning, biar kepakai pake inisialisasi 

public class Latihan {
	public static void main(String args[]) {
		// inisialisasi scanner input
		Scanner input = new Scanner(System.in);
		// inputan nama dan npm pke inisialisasi variabel
		String namaDepan, namaBelakang, fullName, npm;
		System.out.println("Nama Depan : ");
		namaDepan = input.next();
		System.out.println("Nama Belakang: ");
		namaBelakang = input.next();
		fullName = namaDepan + " " +namaBelakang;
		
		System.out.println("NPM : ");
		npm= input.next();
		
		System.out.println("\nNama : "+fullName);
		System.out.println("Nama Belakang: "+fullName);
		System.out.println("Npm : "+npm +"\n");
		
		//pertemuan pertama materi ke 2		
		// untuk inisialisasi variable baru dengan angka menggunakan int
		int angka1, angka2, hasil;
				
		// user inpu
		System.out.println("Masukan angka 1 : "); //klo mau g di enter print aja jangan pake ln
		angka1 = input.nextInt(); //nextin setiap data user berupa data int, klo next doang itu string
			
		System.out.println("Masukan angka 2: ");
		angka2 = input.nextInt();
		// perhitungan hasil bisa menggunakan +, -, x, /
		hasil = angka1 + angka2;
		// outputnya
		System.out.println("Hasilnya : "+hasil);
	}
}
