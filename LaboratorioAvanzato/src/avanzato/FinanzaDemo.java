package avanzato;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

//class OrdinatorePerPrezzo implements Comparator<Azione>{
//
//	@Override
//	public int compare(Azione o1, Azione o2) {
//		return Double.compare(o1.getValore(),o2.getValore());
//	}
//}

//class OrdinatorePerPrezzoDecrescente implements Comparator<Azione>{
//	
//	@Override
//	public int compare(Azione o1, Azione o2) {
//		return Double.compare(o2.getValore(),o1.getValore());
//	}	
//}
//
//class OrdinatorePerId implements Comparator<Azione>{
//	
//	@Override
//	public int compare(Azione o1, Azione o2) {
//		return o1.getId()-o2.getId();
//	}	
//}


public class FinanzaDemo {

	public static void main(String[] args) {

		Azione a1 = new Azione(1, "ferrari", 15);
		Azione a2 = new Azione(2, "maseerati", 10);
		Azione a3 = new Azione(3, "porsche", 25);
		Azione a4 = new Azione(4, "audi", 18);
		
		List<Azione> azioneMauro = List.of(a1, a2, a3, a4);
		Set<Azione> azioniSurya = Set.of(a1, a2, a4);
		
		Portafoglio p1 = new Portafoglio(azioneMauro);
		Portafoglio p2 = new Portafoglio(azioniSurya);
		
//		Collections.sort((List<Azione>)p1.getTitoli());
		
//		OrdinatorePerPrezzo opp = new OrdinatorePerPrezzo();
//		OrdinatorePerPrezzoDecrescente opd = new OrdinatorePerPrezzoDecrescente();
		
//		Comparator<Azione> cpa = new Comparator<Azione>() {
//			@Override
//			public int compare(Azione o1, Azione o2) {
//				return Double.compare(o1.getValore(),o2.getValore());
//			}
//		};
		
		p1.getTitoli()
			.stream()
			.sorted((azione2, azione1)-> //faccio una lambda function invece di creare classe comparator e oggetto
				Double.compare(azione1.getValore(),azione2.getValore()))
			.forEach(a -> System.out.println(a));
		
	}

}
