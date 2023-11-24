package praktikum5;
import java.util.Scanner;
public class Test {
	public static void main(String[]args) {
		String nama, warna;
		int umur;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan nama kucing oksa : ");
		nama = input.next();
		System.out.print("Masukan warna kucing oksa : ");
		warna = input.next();
		System.out.print("Masukan umur kucing oksa : ");
		umur = input.nextInt();
		
		Cat kucingoksa = new Cat();
		kucingoksa.identitas(nama, warna, umur); //"Blackie di ganti nama agar user bisa masukan
		System.out.println(kucingoksa.ambilNama()
				+ " warnanya "+kucingoksa.ambilWarna()
				+ " umurnya "+kucingoksa.ambilUmur()+ " years old.");
		kucingoksa.eat();
	}
}
