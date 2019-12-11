package tests;

import bank.system.core.Account;
import bank.system.core.Client;

public class TestClient {
	
	public static void main(String[] args) {
		
		// create a client
		Client client = new Client(101, "David", 50_000);
		
		// the client want a new account with 20_000
		// create an account object
		Account account = new Account(111, 20_000);
		
		// add the account to the client
		client.addAccount(account);
	}

}
