package ObjectProject;

public class Movie {
	private String name;
	private String director;
	private int actorNum;
	private Actor[] actors;

	public Movie(String name, String director, Actor[] actors) {
		this.name = name;
		this.director = director;
		this.actors = actors;
		this.actorNum = this.actors.length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getActorNum() {
		return actorNum;
	}

	public void setActorNum(int actorNum) {
		this.actorNum = actorNum;
	}

	public Actor[] getActors() {
		return actors;
	}

	public void setActors(Actor[] actors) {
		this.actors = actors;
	}

	public void awardWinningActors() {
		for (int i = 0; i < this.actors.length; i++)
			if (this.actors[i].isAwardWon()) System.out.println(this.actors[i].getName());
	}
}
