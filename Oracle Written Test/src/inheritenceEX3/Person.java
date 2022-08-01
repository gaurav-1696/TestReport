package inheritenceEX3;

import java.util.Arrays;

public class Person  {
int id;
String name,contact,address;
IdProof idProof[];
public int getId() {
	return id;
}
public void setId(int id) { 
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public IdProof[] getIdProof() {
	return idProof;
}
public void setIdProof(IdProof[] idProof) {
	this.idProof = idProof;
}
public String toString()
{
	return id+" "+name+" "+contact+" "+address+" "+Arrays.toString(idProof) ;
}

}
