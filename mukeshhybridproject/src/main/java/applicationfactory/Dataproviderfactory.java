package applicationfactory;

import Dataprovider.Exceldataprovider;
import Dataprovider.configdataprovider;

public class Dataproviderfactory {
	
	public static configdataprovider getconfig(){
		configdataprovider config=new configdataprovider();
		return config;
		
		
	}
public static Exceldataprovider getExcel(){
	
	
	Exceldataprovider excel=new Exceldataprovider();
	return excel;
	
}
}
