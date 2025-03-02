package org.adactinn;
import org.testng.annotations.*;

public class DataProviderry {

	
	@DataProvider(name="URL")
	private Object data() {
		
		Object [][] obj = {{"sasi","kumar","sasi@gmail.com","sasi@7647"},{"sai","kirar","kiars@gmail.com","kiysi@7647"}};
		return obj;
		
		

	}
	
	
}
