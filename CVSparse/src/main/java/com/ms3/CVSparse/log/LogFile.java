package com.ms3.CVSparse.log;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LogFile {
	public static void printLog(int count_successful,int count_bad, String filename) {
		FileHandler handler;
		File file = new File("src/main/resources/ms3Interview.log");
		
		//Delete if file exists
		if(file.exists())
		{
			file.delete();
		}
		try 
		{	
			//Creating a log file
			handler = new FileHandler("src/main/resources/"+ filename +".log",false);
			Logger log = Logger.getLogger("com.ms3");
			log.addHandler(handler);
			log.info("No. of records received = "+ (count_bad + count_successful));
			log.info("No. of records successful = " + count_successful);
			log.info("No. of records failed = " + count_bad);
			handler.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
