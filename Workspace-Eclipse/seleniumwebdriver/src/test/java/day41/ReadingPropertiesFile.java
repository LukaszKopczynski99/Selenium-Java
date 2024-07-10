package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//create object of Properties class
		Properties propertiesobj = new Properties();
		
		//location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//Loading properties file
		propertiesobj.load(file);
		
		//Reading data from properties file 
		
		String url = propertiesobj.getProperty("apprul");
		String email = propertiesobj.getProperty("email");
		String password = propertiesobj.getProperty("password");
		String orderid = propertiesobj.getProperty("orderid");
		String customerid = propertiesobj.getProperty("customerid");
		
		System.out.println(url+" "+email+" "+password+" "+orderid+" "+customerid);

		
		//reading all the keys from properties file 
		Set<String> keys= propertiesobj.stringPropertyNames();
		System.out.println(keys);
		
		 Set<Object> keyss = propertiesobj.keySet();
		 System.out.println(keyss);
		 
		 //reading all the values from properties file
		 Collection<Object> values  =  propertiesobj.values();
		 System.out.println(values);
		 
		 file.close();
	}

}
