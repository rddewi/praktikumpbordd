package praktikum2;

import java.util.Scanner;

public class PengkondisianSwitch {
	public static void main(String args[]) {
		//inisialisasi
				int angka1, angka2, hasil;
				String perhitungan;
				Scanner input = new Scanner(System.in);// Java utilnya g ngaruh klo g di pake juga
				//input user
				System.out.print("Masukan angka 1 : ");
				angka1 = input.nextInt();
				System.out.print("Masukan angka 2 : ");
				angka2 = input.nextInt();
				System.out.print("List Perhitungan :"
						+ "\n + : pertambahan"
						+ "\n - : pengurangan"
						+ "\n * : perkalian"
						+ "\n / : pembagian"
						+ "\n Masukan perhitungan : ");
				perhitungan = input.next();
				//kondisi Switch
				switch(perhitungan) {
				case "+":
					hasil = angka1 + angka2;
					System.out.println("Hasilnya adalah : "+hasil);
					break; // ketika kondisi beres, program ini di berhentikan g di lanjut kan ke bawah
				case "-":
					hasil = angka1 - angka2;
					System.out.println("Hasilnya adalah : "+hasil);
					break;
				case "*":
					hasil = angka1 * angka2;
					System.out.println("Hasilnya adalah : "+hasil);
					break;
				case "/":
					hasil = angka1 / angka2;
					System.out.println("Hasilnya adalah : "+hasil);
					break;
				default:
				System.out.println("Sistem yang dimasukan salah!");
				
				}
	}
}
