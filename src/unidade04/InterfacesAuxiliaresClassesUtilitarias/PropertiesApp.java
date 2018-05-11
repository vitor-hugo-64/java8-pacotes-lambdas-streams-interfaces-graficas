package unidade04.InterfacesAuxiliaresClassesUtilitarias;

import java.io.FileInputStream;
import java.util.Properties;
 // Existem classes auxiliares que podem ajudar na hora de mexer com collectiona e uma delas é a propertie
public class PropertiesApp {
	
	public static void main(String[] args) throws Exception
	{
		Properties sites = new Properties();
		sites.loadFromXML(new FileInputStream("C:/Users/Vitor Hugo/workspace/unidade02/site.xml"));
		System.out.println(sites.getProperty("1"));
	}

}
