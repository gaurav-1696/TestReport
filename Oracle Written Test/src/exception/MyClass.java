package exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass {
void myMethod1() throws IOException
{
	throw new IOException("Exception");
}
void myMethod2() throws IOException
{
	throw new IOException("Exception");
}
void myMethod3()
{
	File f=new File("C://cvv.txt");
	FileReader fr=null;
	FileWriter fw=null;
	try
	{
		fw=new FileWriter(f);
		fw.write("welcome in disney land");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
public static void main(String[] args) throws IOException {
	MyClass d=new MyClass();
	d.myMethod1();
}
}

