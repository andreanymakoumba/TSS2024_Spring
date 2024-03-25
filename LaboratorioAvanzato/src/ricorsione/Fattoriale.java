package ricorsione;

public class Fattoriale {

	public static void main(String[] args) {
		int x = 20;
		long start = System.currentTimeMillis();
		long result = fattoriale(x);
		long stop = System.currentTimeMillis();
		System.out.println("Il fattoriale di "+x+" è "+result);
		System.out.printf("Il tempo impiegato è %d", (stop-start));
	}
	
	private static long fattoriale(long num) {
		if (num == 0) 
			return 1;
		else
			return num*fattoriale(num-1);
	}

}
