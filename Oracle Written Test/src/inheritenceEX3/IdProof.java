package inheritenceEX3;

public class IdProof {
String named,number,validity;

public String getNamed() {
	return named;
}

public void setNamed(String named) {
	this.named = named;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getValidity() {
	return validity;
}

public void setValidity(String validity) {
	this.validity = validity;
}
public String toString()
{
	return named+" "+number+" "+validity;
}
}
