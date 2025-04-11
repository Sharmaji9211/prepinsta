
public class MovieBookApp extends Thread
{
	static BookSeats BS;
	int setas;
	public void run() {
		BS.book_seats(setas);
	}
	
	public static void main(String[] args) {
		BS= new BookSeats();
		MovieBookApp MBA = new MovieBookApp();
		MBA.setas=7;
		MBA.start();
		MBA.yield();
		MovieBookApp MBA1 = new MovieBookApp();
		MBA1.setas=10;
		MBA1.start();
		MBA1.yield();
		MovieBookApp MBA2 = new MovieBookApp();
		MBA2.setas=8;
		MBA2.start();
	}
}
