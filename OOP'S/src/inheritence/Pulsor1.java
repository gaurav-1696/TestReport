package inheritence;

public class Pulsor1 extends Bike1 {
  int weight;
  String name,modelno;
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getModelno() {
	return modelno;
}
public void setModelno(String modelno) {
	this.modelno = modelno;
}
public String toString()
{
	  return name+" "+modelno+" "+milage+" "+weight+" "+price+ " "+color;
}
void engine()
{
	  System.out.println("220 cc");
}
}
