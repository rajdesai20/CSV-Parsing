package com.ms3.CVSparse.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVWriter;

public class WriteBad {
	
	public static void writeBad(ArrayList<String[]> list,String filename) {
		File file = new File("src/main/resources/"+ filename +"-bad.csv");
		
		//Delete file if exists
		if(file.exists()) 
		{
			file.delete();
		}
		try 
		{	
			//Writing the bad records in the csv
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			CSVWriter wr = new CSVWriter(fw);
			for(String[] str : list) {
				wr.writeNext(str);
		}
			wr.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
