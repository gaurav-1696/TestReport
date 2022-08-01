package containment;

import java.util.Arrays;

public class Movie1 {

	int boxOfficeCollection,id;
	String movieName;
	Actor actor[];
	public int getBoxOfficeCollection() {
		return boxOfficeCollection;
	}
	public void setBoxOfficeCollection(int boxOfficeCollection) {
		this.boxOfficeCollection = boxOfficeCollection;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Actor[] getActor() {
		return actor;
	}
	public void setActor(Actor[] actor) {
		this.actor = actor;
	}
	@Override
	public String toString() {
		return  boxOfficeCollection + " " + id + " " + movieName
				+ " " + Arrays.toString(actor);
	}
	
}
