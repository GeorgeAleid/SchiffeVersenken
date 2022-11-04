package SchiffeVersenken;

import java.util.Scanner;

public class Spielfeld {
	private Player player;

	public Spielfeld(Player player1, Player player2) {
		this.player = player1;
		this.player = player1;
	}

	public void printFields(Player player) {
		String array1[][] = player.getArray1();
		String array2[][] = player.getArray2();
		System.out.println("Spieler: " + player.getNumber());
		System.out.print(" ");
		for (int i = 1; i < 11; i++) {
			System.out.print(i);
		}
		System.out.println();
		int pos = 65;
		for (int i = 0; i < array1.length; i++) {
			System.out.print((char) pos);
			pos++;
			for (int j = 0; j < array1[0].length; j++) {
				System.out.print(array1[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------");
		System.out.println("Gegner: ");
		System.out.print(" ");
		for (int i = 1; i < 11; i++) {
			System.out.print(i);
		}
		System.out.println();
		int pos1 = 65;

		for (int i = 0; i < array2.length; i++) {
			System.out.print((char) pos1);
			pos1++;
			for (int j = 0; j < array2[0].length; j++) {
				System.out.print(array2[i][j]);
			}
			System.out.println();
		}

	}

	public int umwandlung(char c) {
		int erg = (char) c - 64;
		return erg;
	}

	public void Start(Player p) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("3 U-Boote (Länge 2)\r\n" + "2 Zerstörer (Länge 3)\r\n" + "1 Kreuzer (Länge 4)\r\n"
				+ "1 Schlachtschiff (Länge 5)\r\n" + "");
		//U-boote
		System.out.println("1. U-boot mit lange 2");
		System.out.println(" von zeile?");
		String zS = sc.next();
		char z = zS.charAt(0);
		System.out.println(" von spalte?");
		int s = sc.nextInt();
		System.out.println(" bis zeile?");
		String zS1 = sc.next();
		char z1 = zS1.charAt(0);
		System.out.println(" bis spalte?");
		int s1 = sc.nextInt();
		setShip(p, z, s, z1, s1, 2);
//		System.out.println("2. U-boot mit lange 2");
//		System.out.println(" von zeile?");
//		zS = sc.next();
//		z = zS.charAt(0);
//		System.out.println(" von spalte?");
//		s = sc.nextInt();
//		System.out.println(" bis zeile?");
//		zS1 = sc.next();
//		z1 = zS.charAt(0);
//		System.out.println(" bis spalte?");
//		s1 = sc.nextInt();
//		setShip(p, z, s, z1, s1, 2);
//		System.out.println("3. U-boot mit lange 2");
//		System.out.println(" von zeile?");
//		zS = sc.next();
//		z = zS.charAt(0);
//		System.out.println(" von spalte?");
//		s = sc.nextInt();
//		System.out.println(" bis zeile?");
//		zS1 = sc.next();
//		z1 = zS.charAt(0);
//		System.out.println(" bis spalte?");
//		s1 = sc.nextInt();
//		setShip(p, z, s, z1, s1, 2);
//	//	Zerstörer
//		System.out.println("1. Zerstörer mit lange 3");
//		System.out.println(" von zeile?");
//		zS = sc.next();
//		z = zS.charAt(0);
//		System.out.println(" von spalte?");
//		s = sc.nextInt();
//		System.out.println(" bis zeile?");
//		zS1 = sc.next();
//		z1 = zS.charAt(0);
//		System.out.println(" bis spalte?");
//		s1 = sc.nextInt();
//		setShip(p, z, s, z1, s1, 3);
//		
//		System.out.println("2. Zerstörer mit lange 3");
//		System.out.println(" von zeile?");
//		zS = sc.next();
//		z = zS.charAt(0);
//		System.out.println(" von spalte?");
//		s = sc.nextInt();
//		System.out.println(" bis zeile?");
//		zS1 = sc.next();
//		z1 = zS.charAt(0);
//		System.out.println(" bis spalte?");
//		s1 = sc.nextInt();
//		setShip(p, z, s, z1, s1, 3);
//		//Kreuzer
//		System.out.println(" Kreuzer mit lange 4");
//		System.out.println(" von zeile?");
//		zS = sc.next();
//		z = zS.charAt(0);
//		System.out.println(" von spalte?");
//		s = sc.nextInt();
//		System.out.println(" bis zeile?");
//		zS1 = sc.next();
//		z1 = zS.charAt(0);
//		System.out.println(" bis spalte?");
//		s1 = sc.nextInt();
//		setShip(p, z, s, z1, s1, 4);
//		//Schlachtschiff
//		System.out.println(" Schlachtschiff mit lange 5");
//		System.out.println(" von zeile?");
//		zS = sc.next();
//		z = zS.charAt(0);
//		System.out.println(" von spalte?");
//		s = sc.nextInt();
//		System.out.println(" bis zeile?");
//		zS1 = sc.next();
//		z1 = zS.charAt(0);
//		System.out.println(" bis spalte?");
//		s1 = sc.nextInt();
//		setShip(p, z, s, z1, s1, 5);
	}

	public boolean setShip(Player p, char c, int s, char c1, int s1, int l) {
		String[][] array = p.getArray1();
		int z = umwandlung(c);
		int z1 = umwandlung(c1);
		z = z - 1;
		s = s - 1;
		z1 = z1 - 1;
		s1 = s1 - 1;
		l = l - 1;
		if (z < array.length && z >= 0 && z1 < array.length && z1 >= 0 && s < array.length && s >= 0
				&& s1 < array.length && s1 >= 0) {
			if (z == z1 && s - s1 == l) {
				int counter = 0;
				int pos = s1;
				for (int i = 0; i <= l; i++) {
					if (array[z][pos].equals(" ")) {
						counter++;
					} else {
						System.out.println("ungueltige eingabe");
					}
					if (counter == l + 1) {
						for (int j = 0; j <= l; j++) {

							array[z][pos] = "S";
							pos++;
						}
						printFields(p);
						return true;
					}

				}
			} else if (z == z1 && s - s1 == -l) {
				int counter = 0;
				int pos = s;
				for (int i = 0; i <= l; i++) {
					if (array[z][pos].equals(" ")) {
						counter++;
					} else {
						System.out.println("ungueltige eingabe");
					}
					if (counter == l + 1) {
						for (int j = 0; j <= l; j++) {
							array[z][pos] = "S";
							pos++;
						}
						printFields(p);
						return true;
					}

				}
			} else if (s == s1 && z - z1 == l) {
				int counter = 0;
				int pos = z1;
				for (int i = 0; i <= l; i++) {
					if (array[i][s].equals(" ")) {
						counter++;
					} else {
						System.out.println("ungueltige eingabe");
					}

					if (counter == l + 1) {
						for (int j = 0; j <= l; j++) {
							array[pos][s] = "S";
							pos++;
						}
						printFields(p);
						return true;
					}

				}
			} else if (s == s1 && z - z1 == -l) {
				int counter = 0;
				int pos = z;
				for (int i = 0; i <= l; i++) {
					if (array[pos][s].equals(" ")) {
						counter++;
					} else {
						System.out.println("ungueltige eingabe");
					}
					if (counter == l + 1) {
						for (int j = 0; j <= l; j++) {
							array[pos][s] = "S";
							pos++;
						}
						printFields(p);
						return true;
					}

				}
			}

		}

		return false;
	}

	public boolean shoot(Player p1, Player p2, char c, int s) {
		String[][] arrayG = p1.getArray2();
		String[][] array = p2.getArray1();
		int z=  umwandlung(c);;
		z = z - 1;
		s = s - 1;
		if (z < arrayG.length && z >= 0 && s < arrayG.length && s >= 0) {
			if (arrayG[z][s].equals(" ")) {
				if (array[z][s].equals(" ")) {
					arrayG[z][s] = "O";
					array[z][s] = "O";
					System.out.println("You Missed :( ");
					printFields(p1);
					return true;
				} else {
					arrayG[z][s] = "*";
					array[z][s] = "*";
					System.out.println("Nice Shot!!");
					printFields(p1);
					return true;
				}
			} else
				System.out.println("Bereit geschossen!");

		} else {
			System.out.println("Ungueltige eingabe");
		}

		return false;
	}

	public boolean update(Player p) {
		String array[][] = p.getArray1();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j].equals("S")) {
					return false;
				}

			}
		}
		return true;
	}
}
