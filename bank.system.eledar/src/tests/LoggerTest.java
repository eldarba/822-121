package tests;

import bank.system.core.Log;
import bank.system.core.Logger;

public class LoggerTest {
	
	public static void main(String[] args) {
		
		// create 2 log objects
		Log log1 = new Log(0, 101, "test1", 200);
		Log log2 = new Log(1500, 102, "test2", 35.8F);
		
		// create a logger object
		Logger logger = new Logger("driverName");
		
		// use the logger to log (store) the 2 log objects above
		logger.log(log1);
		logger.log(log2);
	}

}
