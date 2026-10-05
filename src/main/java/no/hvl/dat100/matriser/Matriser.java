package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println(); // Ny linje for hver rad
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String resultat = "";
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				resultat += matrise[i][j];
				if (j < matrise[i].length - 1) {
				resultat += " ";
				}
			}
			resultat += "\n";
		}
		
		return resultat;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		// Sjekk først om de har like mange rader
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {	// Sjekk om radene har lik lengde
				return false;
			}
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {	// Sjekk hver enkelt tallverdi
					return false;
				}
			}
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] nyMatrise = new int[matrise[0].length][matrise.length];
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[j][i] = matrise[i][j];	// Bytter plass på i og j
			}
		}
		
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		return c;
	}
}