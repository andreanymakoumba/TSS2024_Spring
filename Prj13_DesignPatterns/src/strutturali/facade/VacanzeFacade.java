package strutturali.facade;

import java.time.LocalDate;

public class VacanzeFacade {
	
	public void book(LocalDate startTime, LocalDate endTime) {
		Flight volo = new Flight();
		volo.bookDeparture(startTime);
		volo.bookArrival(endTime);
		
		Hotel hotel = new Hotel();
		hotel.book(startTime, endTime);
		
		CarRental auto = new CarRental();
		auto.book(startTime, endTime);
	}
}
