package inheritenceEX2;

import java.util.Scanner;

public class LaptopMain  {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the noOfPort,processorSpeed");
	int noOfUSBPort=sc.nextInt();
	int processorSpeed=sc.nextInt();
	Laptop l=new Laptop();
	l.setNoOfUSBPort(noOfUSBPort);
	l.setProcessorSpeed(processorSpeed);
	//System.out.println(l);
	System.out.println("noOfUSBPort= "+l.getNoOfUSBPort()+" "+"processorspeed= "+l.getProcessorSpeed()+" Hz");
	sc.close();
}
}
