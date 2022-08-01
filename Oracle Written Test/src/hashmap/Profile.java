package hashmap;

public class Profile {
String state,country;

public Profile(String state, String country) {
	
	this.state = state;
	this.country = country;
}

@Override
public String toString() 
{
	return state + " " + country ;
}

}
