package SchiffeVersenken;

public class Player {
	private String array1[][];
	private String array2[][];
	private int number;

	public Player(int number) {
		this.number = number;
		this.array1 = new String[10][10];
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				array1[i][j] = " ";
			}
		}
		this.array2 = new String[10][10];
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				array2[i][j] = " ";
			}
		}
	}

	public String[][] getArray1() {
		return array1;
	}

	public String[][] getArray2() {
		return array2;
	}

	public int getNumber() {
		return number;
	}
}
