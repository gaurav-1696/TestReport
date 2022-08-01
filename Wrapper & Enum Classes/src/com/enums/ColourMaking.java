package com.enums;

public enum ColourMaking {
ORANGE("Red","Yellow")
{
	public String toString()
	{
		return "orange is comibination of red & Yellow";
	}
},
GREEN("Blue","Yellow")
{
	public String toString()
	{
		return "green is combination of blue & yellow";
	}
},
PINK("Red","White")
{
	public String toString()
	{
		return "pink is a combination of white & red";
	}
},
GREY("Black","White"){
	public String toString()
	{
		return "grey is a combination of black & white";
	}
};
	private ColourMaking(String string, String string2) {
		this.color=color;
		
	// TODO Auto-generated constructor stub
}

	String color;

}
