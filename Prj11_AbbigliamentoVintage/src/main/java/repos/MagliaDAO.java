package repos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Colore;
import model.Maglia;
import model.Taglia;

public class MagliaDAO {
	private List<Maglia> maglie = new ArrayList<Maglia>();
	
	{
		Colore[] colori = {Colore.BLUE, Colore.GREEN, Colore.RED};
		Taglia[] taglie = {Taglia.S, Taglia.M, Taglia.L};
		String[] scritte = {"Frutta", "Verdura", "Carne", "Cocktail"};
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			maglie.add(new Maglia(scritte[random.nextInt(scritte.length)], i, colori[random.nextInt(colori.length)],taglie[random.nextInt(taglie.length)]));
		}
	}
	
	public List<Maglia> getMaglie(){
		return maglie;
	}
}
