package com.ms3.CVSparse.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.hibernate.Session;

import com.ms3.CVSparse.Model.Col_Data;
import com.ms3.CVSparse.Session.Get_Session;
import com.ms3.CVSparse.log.LogFile;

public class FileRead {
	
	//Array for holding the bad records
	ArrayList<String[]> bad_records = new ArrayList<String[]>();
	
	//Counts for successful and bad records
	int count_successful =0 ;
	int count_bad = 0;
	
	public void parse(String filename){

	try 
	{
		//Get Hibernate Session 
		Session session = Get_Session.getSession(filename);	
		session.clear();
		session.beginTransaction();
		
		BufferedReader bf  = new BufferedReader(new FileReader("src/main/resources/"+ filename +".csv"));
		bf.readLine();
		String st;
		String[] str;
		outer :while((st = bf.readLine()) != null) {
			//Regular Expression for splitting the data in csv file
			str = st.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
			//For records which have less than 10 columns data
			if(str.length!=10) {
				bad_records.add(str);
				count_bad++;
				continue;
			}
			
			Col_Data cold = new Col_Data();
			Class cl = cold.getClass();
			Field[] fields = cl.getDeclaredFields();
			
			//Setting the attributes of object from csv file
			for(int i=0;i<fields.length;i++) {
				fields[i].setAccessible(true);
				
				//For records which have empty column data
				if(str[i].length()==0) {
					bad_records.add(str);
					count_bad++;
					continue outer;
				}
				fields[i].set(cold, str[i]);
			}
			
			//Saving the data into database
			session.save(cold);
			count_successful++;
		}
		session.getTransaction().commit();
		session.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		//Creating the bad csv file
		WriteBad.writeBad(bad_records,filename);
		
		//Creating the log file
		LogFile.printLog(count_successful, count_bad,filename);
		
		}
	}