package praktikum4;
import java.util.Scanner;
public class TestTabungan { //class tabungan
	public static void main(String args[]) { //main class
		// inisialisasi scanner input
		Scanner input = new Scanner(System.in); 
		int saldo, tariktunai; //variabel dengan int untuk menghasilkan angka
		//input dan cetak
		System.out.print("Masukkan Saldo Awal : ");// cetak
		saldo = input.nextInt();//input
		Tabungan atm = new Tabungan(saldo); //variable atm dan Tabungan panggilan char
		System.out.println("Saldo Anda : "+atm.saldo); 
		
		System.out.print("Jumlah uang yang diambil : ");
		tariktunai = input.nextInt();// pada input.nexInt kalau int menggunakan nextInt
		atm.ambilUang(tariktunai);// output untuk jumlah uang yang diambil
		//cetak jumlah yang diambil = hasil dari perhitungan
		System.out.println("Jumlah uang yang diambil : "+tariktunai); 
		// cetak output atau hasil
		System.out.println("Saldo Anda Sekarang: "+atm.saldo);
	}
	
}