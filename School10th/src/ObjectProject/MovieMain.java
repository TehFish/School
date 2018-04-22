package ObjectProject;

import java.util.Scanner;

public class MovieMain {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the movie name, and director, and number of actors in the movie");
		Movie m = new Movie(sc.next(), sc.next(), createActorArray(sc.nextInt()));
		Movie[] movies = new Movie[1];
		movies[0] = m;
		System.out.println("Enter the ciname name");
		Cinema c = new Cinema(sc.next(), movies);
		for (int i = 0; i < c.getShowingNum(); i++) {
			for (int j = 0; j < c.getMovies()[i].getActorNum(); j++) {
				if (c.getMovies()[i].getActors()[j].isAwardWon())
					System.out.println(c.getMovies()[i].getName()+" Has won awards");
			}
		}
	}
	
	public static Actor[] createActorArray(int num) {
		Actor[] actors = new Actor[num];
		for (int i = 0; i < actors.length; i++) {
			System.out.println("Enter the actors name,");
			System.out.print(" his number of years acting, ");
			System.out.print(" his age and wheather they won an award");
			actors[i] = new Actor(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextBoolean());
		}
		return actors;
	}
	
	public static void AvgAge(Movie m) {
		int aboveAvg = 0, belowAvg = 0;
		double avg = 0;
		for (int i = 0; i < m.getActorNum(); i++) 
			avg += m.getActors()[i].getAge();
		avg /= m.getActorNum();
		System.out.println(avg);
		for (int j = 0; j < m.getActorNum(); j++) {
			if (m.getActors()[j].getAge() < avg) belowAvg++;
			else aboveAvg++;
		}
		if (belowAvg > aboveAvg) System.out.println("There are more people below the average age");
		else System.out.println("There are more people above the average age");
	}
	
}
