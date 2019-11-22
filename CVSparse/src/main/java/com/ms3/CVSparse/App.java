package com.ms3.CVSparse;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.ms3.CVSparse.dao.FileRead;

public class App 
{
    public static void main( String[] args )
    {	
    	
    	//Scanning the csv file name
    	Scanner scanner =new Scanner(System.in);
    	System.out.println("Enter name of csv file : ");
    	String filename = scanner.nextLine();
    	if(new File("src/main/resources/"+ filename+".csv").exists()) {
        FileRead fd = new FileRead();
        fd.parse(filename);
    	}
    	else 
    	{
    		System.out.println("File not found");
    	}
        System.out.println("Program has ended");
    }
}
