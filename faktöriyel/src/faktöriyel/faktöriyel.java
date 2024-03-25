package faktöriyel;

import java.util.Scanner;

public class faktöriyel {

	public static void main(String[] args) {
	
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Hesaplamak istediğiniz sayıyı giriniz :");
		 int sayi = input.nextInt();
		 int faktöriyel = 1;

		for(int i =1; i <= sayi;i++) {
			
			faktöriyel  *= i;
			
			
		
		}
		System.out.print(faktöriyel);
	
	} 

}
