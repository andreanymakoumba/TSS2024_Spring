package strutturali.facade;

import java.time.LocalDate;

public class Flight {

	public void bookDeparture(LocalDate andata) {
		System.out.printf("Partenza volo andata il %s %n", andata);
	}
	public void bookArrival(LocalDate ritorno) {
		System.out.printf("Partenza volo ritorno il %s %n", ritorno);
	}
}
