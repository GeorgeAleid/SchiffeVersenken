package SchiffeVersenken;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Spielfeld sp = new Spielfeld(p1, p2);
		Scanner sc = new Scanner(System.in);
		sp.printFields(p1);
		sp.Start(p1);
		sp.printFields(p1);
		System.out.println();
		System.out.println();
		sp.printFields(p2);
		sp.Start(p2);
		sp.printFields(p2);
		boolean player = true;
		do {
			if (player) {
				
				System.out.println(p1.getNumber()+" shoot zeile");
				String f = sc.next();
				char z=f.charAt(0);
				System.out.println(p1.getNumber()+" shoot spalte");
				int s = sc.nextInt();
				
				if(sp.shoot(p1,p2,z,s)) {
					player=false;
				}
				

			}
			else {
				System.out.println(p2.getNumber()+" shoot zeile");
				String f = sc.next();
				char z=f.charAt(0);
				System.out.println(p2.getNumber()+" shoot spalte");
				int s = sc.nextInt();
				
				if(sp.shoot(p2,p1,z,s)) {
					player=true;
				}
			}
		} while (!sp.update(p1) && !sp.update(p2));
		if(!player) {
			System.out.println("Spieler 1 hat gewonnen");
		}else 
			System.out.println("Spieler 2 hat gewonnen");


	}
}
