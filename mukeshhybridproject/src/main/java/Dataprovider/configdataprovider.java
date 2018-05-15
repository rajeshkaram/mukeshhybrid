package Dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configdataprovider {
	
	Properties pro;
	public configdataprovider(){
		
		try 
		{
			File src = new File(".\\configuration\\config.properties");

		
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();

			pro.load(fis);
			
		} catch (Exception e) 
		{
			System.out.println("Failed to load config file");
		}

	}
	
	public String getTestapplicationURL()
	{
		return pro.getProperty("Testurl");
	}

	public String startapplication()
	{
		return pro.getProperty("browser");
	}
	
	public String getValue(String key)
	{
		
		return pro.getProperty(key);
	}
	


	}


