package config.Properties;

import java.io.*;
import java.util.Properties;

public class propertiesfile {
	
	public static Properties prop;
	public static String propertyfile(String ParameterName) throws IOException
	{
		FileInputStream file= new FileInputStream("C:\\Usha\\HybridTestNGFramework\\Thrucare_Medical\\Properties\\data.properties");
		
		 prop=new Properties();
		
		prop.load(file);
			
		String ParameterValue=prop.getProperty(ParameterName);
		return ParameterValue;

	}
	
	public static String saveProperty(String key, String value) {
       
        prop=new Properties();
        try (OutputStream outputStream = new FileOutputStream("C:\\Usha\\HybridTestNGFramework\\Thrucare_Medical\\Properties\\data.properties")) {
        	
            prop.setProperty(key, value);
            
            prop.store(outputStream, "Generated fake data");
        } catch (IOException e) {
            e.printStackTrace();
        }
		return value;
	
}
}