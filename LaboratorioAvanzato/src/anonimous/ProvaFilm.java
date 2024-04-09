package anonimous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class ComparatoreRatingAsc implements Comparator<Film>{
//
//	@Override
//	public int compare(Film o1, Film o2) {
//		return o1.getRating()-o2.getRating();
//	}
//	
//}


public class ProvaFilm {

	public static void main(String[] args) {
//		LeggiFile.leggi("C:\\Users\\angel\\Downloads\\bestfilm2023.csv")
//				 .stream()
//				 .forEach(s->System.out.println(s));
		
		List<Film> films = new ArrayList<Film>();
		
		int i = 0;
		for (String riga : LeggiFile.leggi("C:\\Users\\angel\\Downloads\\bestfilm2023.csv")) {
			String[] split = riga.split(";");
			
			if(i++ > 0) {
				int id = Integer.parseInt(split[0]);
				int anno = Integer.parseInt(split[2]);
				int rating = Integer.parseInt(split[3]);
				String titolo = split[1].replaceAll("\"", "");
				String regista = split[4].replaceAll("\"", "");
				
				Film f = new Film();
				f.setAnno(anno);
				f.setId(id);
				f.setRating(rating);
				f.setRegistra(regista);
				f.setTitolo(titolo);
				films.add(f);
			}
		}
		
//		ComparatoreRating cr = new ComparatoreRating();
//		Comparator<Film> cra = new Comparator<Film>() { //tipo nonimo innestato
//			
//			@Override
//			public int compare(Film o1, Film o2) {
//				return o1.getRating()-o2.getRating();
//			}
//		};
		
//		Comparator<Film> cra = (o1, o2) -> o1.getRating()-o2.getRating();
		List<Film> ordinatiPerTitolo = films
			.stream()
			.filter(f -> f.getRating()> 95)
//			.sorted((o1, o2) -> o1.getRating()-o2.getRating())
			.sorted((o1, o2)-> o1.getTitolo().compareTo(o2.getTitolo()))
			.toList();
//			.forEach(System.out::println);
		
		ordinatiPerTitolo
		.stream()
		.map(f -> f.getRegistra())
		.forEach(System.out::println);
	}

}
