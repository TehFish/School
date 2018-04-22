package ObjectProject;

public class Cinema {
	private String name;
	private int showingNum;
	private Movie[] movies;

	public Cinema(String name, Movie[] movies) {
		this.name = name;
		this.movies = movies;
		this.showingNum = this.movies.length;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShowingNum() {
		return showingNum;
	}

	public void setShowingNum(int showingNum) {
		this.showingNum = showingNum;
	}

	public Movie[] getMovies() {
		return movies;
	}

	public void setMovies(Movie[] movies) {
		this.movies = movies;
	}

	public void showActorsInMovies(Movie[] m) {
		String[] movieNames;
		String[] actorsChecked;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].getActorNum(); j++) {
				actorsChecked = new String[m[i].getActorNum()];
				actorsChecked[j] = m[i].getActors()[j].getName();
				if (actorInDifferentMovies(m[i].getActors()[j].getName(), m, i)
						&& actorsChecked(actorsChecked, m[i].getActors()[j])) {
					System.out.println("Actor: "+m[i].getActors()[j].getName());
					movieNames = moviesActorIsIn(m, m[i].getActors()[j].getName());
					for (int k = 0; k < movieNames.length; k++)
						if (!movieNames[k].equals("")) System.out.println(movieNames[k]);
				}
			}
		}
	}

	public boolean actorInDifferentMovies(String actor, Movie[] movies, int actorMoviePos) {
		for (int i = 0; i < movies.length; i++) {
			if (i != actorMoviePos) {
				for (int j = 0; j < movies[i].getActorNum(); j++)
					if (movies[i].getActors()[j].getName().equals(actor)) return true;
			}
		}
		return false;
	}
	
	public String[] moviesActorIsIn(Movie[] m, String actor) {
		String[] movieNames = new String[m.length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].getActorNum(); j++) 
				if (m[i].getActors()[j].getName().equals(actor)) movieNames[i] = m[i].getName();
		}
		return movieNames;
	}
	
	public boolean actorsChecked(String[] actors, Actor a) {
		for (int i = 0; i < actors.length; i++)
			if (actors[i].equals(a.getName())) return false;
		return true;
	}
}
