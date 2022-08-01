package com.enums;
interface A
{
	void discription();
}
public enum BookMyShow implements A {
SILVER(150)
{
	
		/*
		 * public String toString() { return"rate of the silver tickets is Rs.350"; }
		 */

	@Override
	public void discription() {
		// TODO Auto-generated method stub
		
	}
},GOLD(200)
{
		/*
		 * public String toString() { return"rate of the gold tickets is Rs.550"; }
		 */
	

	@Override
	public void discription() {
		// TODO Auto-generated method stub
		
	}
}
,PLATINUM(250)
	{
		/*
		 * public String toString() { return"rate of the platinum tickets is Rs.650"; }
		 */
	

		@Override
		public void discription() {
			// TODO Auto-generated method stub
			
		}
	};


int rate;
private BookMyShow(int rate)
{
	this.rate=rate;
}
void message()
{
	System.out.println("Rate of the ticket is:"+rate);
}
}
