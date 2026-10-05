package no.hvl.dat100.tabeller;

public class Tabeller {

// a)
public static void skrivUt(int[] tabell) {
	for (int i = 0; i < tabell.length; i++) {
		System.out.print(tabell[i]);
		if (i < tabell.length - 1) {
			System.out.print(" ");
		}
	}
	System.out.println();
}

// b)
public static String tilStreng(int[] tabell) {
String resultat = "";

for (int i = 0; i < tabell.length; i++) {
	resultat += tabell[i];
	if (i < tabell.length - 1) {
		resultat += ",";
	}
}

return "[" + resultat + "]";
}


// c)
public static int summer(int[] tabell) {

	int sum = 0;

		for(int i = 0; i < tabell.length; i++) {
		sum += tabell[i];
		}
	return sum;
}

// d)
public static boolean finnesTall(int[] tabell, int tall) {
	for (int i = 0; i < tabell.length; i++) {
		if (tabell[i] == tall) {
			return true;
		}
	}
	return false;
}

// e)
public static int posisjonTall(int[] tabell, int tall) {
	for (int i = 0; i < tabell.length; i++) {
		if (tabell[i] == tall) {
			return i;
		}
	}
	return -1;
}

// f)
public static int[] reverser(int[] tabell) {
	int[] resultat = new int[tabell.length];
	
	for (int i = 0; i < tabell.length; i++) {
		resultat[i] = tabell[tabell.length - 1 - i];
	}
	return resultat;
}

// g)
public static boolean erSortert(int[] tabell) {
	for (int i = 0; i < tabell.length - 1; i++) {
		if (tabell[i] > tabell[i + 1]) {
			return false;
		}
	}
	return true;
}

// h) 
public static int[] settSammen(int[] tabell1, int[] tabell2) {
	int[] nyTabell = new int[tabell1.length + tabell2.length];
	
	int teller = 0;
	
	for (int i = 0; i < tabell1.length; i++) {
		nyTabell[teller] = tabell1[i];
		teller++;
	}
	

	for (int i = 0; i < tabell2.length; i++) {
		nyTabell[teller] = tabell2[i];
		teller++;
	}
	
	return nyTabell;
}

}