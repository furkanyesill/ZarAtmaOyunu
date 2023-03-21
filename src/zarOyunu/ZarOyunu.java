package zarOyunu;

import java.util.Scanner;

public class ZarOyunu {

	public static void main(String[] args) {
		int z1=0, z2 = 0;
		int o1 = 0;
		int o2 = 0;
		int s = 0;
		int fark = 0;
		int x=0,y=0;

		Scanner scan = new Scanner(System.in);
		String a = "Birinci oyuncunun sahip oldugu para miktari:";
		System.out.println(a);
		o1 = scan.nextInt();

		String b = "İkinci oyunucun sahip oldugu para miktari:";
		System.out.println(b);
		o2 = scan.nextInt();

		while (o1 > 0 && o2 > 0 ) {
			s++;
			System.out.println("\nsu anda " + s + ". turundasiniz\n");
			
			System.out.println("1. oyuncu zar atma icin 1 basiniz");
			x=scan.nextInt();
			if(x==1) {
				z1 = ((int) (Math.random() * 6 + 1));
				System.out.println("\no1 oyuncusunun attigi zarin sayisal degeri: " + z1);
			}
			
			System.out.println("\n2. oyuncu zar atma icin 2 basiniz");
			y=scan.nextInt();
			if(y==2) {
				z2 = ((int) (Math.random() * 6 + 1));
				System.out.println("o2 oyuncusunun attigi zarin sayisal degeri: " + z2);
			}

			if (z1 < z2) {
				fark = z2 - z1;
				o1 -= fark;
				o2 += fark;
				System.out.println("\no1 oyuncusunun kalan parasi:" + o1);
				System.out.println("o2 oyuncusunun kalan parasi:" + o2);

			} else if (z1 > z2) {
				fark = z1 - z2;
				o1 += fark;
				o2 -= fark;
				System.out.println("\no1 oyuncusunun kalan parasi:" + o1);
				System.out.println("o2 oyuncusunun kalan parasi:" + o2);
			} else {
				System.out.println("\nlutfen tekrar zar atiniz");
			}
			if (o1 <= 0 || o2 <= 0) {
				break;
			} 

		}
		if (o1 <= 0) {
			System.out.println("2. oyuncu " + s + " . turda oyunu kazandi");
		} else {
			System.out.println("1. oyuncu " + s + " . turda oyunu kazandi");
		}
	}

}
