
public class BookSeats {
	
	int total_seats= 15;
	void book_seats(int seats) {
		 
		 if(seats<=total_seats) {
		  System.out.println(seats+" is booked succesfully");
		  total_seats= total_seats-seats;
		 }
		 else {
			 System.out.println("Please give the valid Seats "+seats+ " Number only " +total_seats + " are available");
		 }
		 
	 }
}
