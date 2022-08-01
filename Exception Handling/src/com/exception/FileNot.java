package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileNot {
void readfile() throws FileNotFoundException
{
	FileInputStream fis=new FileInputStream("c/abc.txt");
}
void saveFile() throws FileNotFoundException
{
	String text="this is demo";
	FileOutputStream fos=new FileOutputStream("c:/xyz.txt");
}
}

 