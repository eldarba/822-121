package tests;

import bank.system.core.Log;

public class LogTest {

	public static void main(String[] args) {

		// use CTOR - Log(long timestamp, int clientId, String description, float
		// amount)

		Log log1 = new Log(0, 101, "test1", 200);
		Log log2 = new Log(1500, 102, "test2", 35.8F);

		// print details of log1
		String meh = log1.getData();
		System.out.println(meh);

		// print details of log2
		System.out.println(log2.getData());

	}

}
