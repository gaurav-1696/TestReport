package containment;

import java.util.Arrays;

public class Movie {
   int boxofficecollection,id;
   String moviename;
   Actor actor[];
public int getBoxofficecollection() {
	return boxofficecollection;
}
public void setBoxofficecollection(int boxofficecollection) {
	this.boxofficecollection = boxofficecollection;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public Actor[] getActor() {
	return actor;
}
public void setActor(Actor[] actor) {
	this.actor = actor;
}
   public String toString()
   {
	   return id+" "+moviename+" "+boxofficecollection+" "+Arrays.toString(actor);  
   }
}
