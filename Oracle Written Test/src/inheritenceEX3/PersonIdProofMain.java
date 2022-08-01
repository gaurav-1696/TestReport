package inheritenceEX3;

import java.util.Arrays;
import java.util.Scanner;

public class PersonIdProofMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person p[]=new Person[3];
		for(int i=0;i<3 ;i++)
		{
			System.out.println("enter the id name,contact,address");
			int id=sc.nextInt();
			String name=sc.next();
			String contact=sc.next();
			String address=sc.next();
			
			IdProof idProof[]=new IdProof[1];
			for(int j=0;j<1;j++)
			{
				System.out.println("enter the name,number,validity");
				String named=sc.next();
				String number=sc.next();
				String validity=sc.next();
				
				IdProof h=new IdProof();
				h.setNamed(named);
				h.setNumber(number);
				h.setValidity(validity);
				idProof[j]=h;
			}
			Person e=new Person();
			e.setId(id);
			e.setName(name);
			e.setContact(contact);
			e.setAddress(address);
			e.setIdProof(idProof);
			p[i]=e;
		}
		System.out.println(Arrays.toString(p));
		for(Person n:p)
		{
			for(IdProof d:n.idProof)
			{
				if(d.getNamed().equals("adharcard") && n.getAddress().equals("pune"))
				{
					System.out.println(n.name+" "+n.contact+" "+n.address);
				}
			}
		}
		sc.close();
	}

}
