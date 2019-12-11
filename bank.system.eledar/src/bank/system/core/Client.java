package bank.system.core;

public class Client {

	// attributes
	private int id;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	private float commissionRate;
	private float interestRate;
	private Logger logger = new Logger("driver-name");

	// CTOR
	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// method
	/**
	 * this method adds account to the client.
	 * 
	 * You should seek the array and place the Account where the first null value is
	 * found.
	 * 
	 * @param newAccount the account to add to the client
	 */
	public void addAccount(Account newAccount) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = newAccount;
				// === LOG THE OPERATION ================
				// 1. create a Log object (with all relevant details)
				long timestamp = System.currentTimeMillis(); // when
				int clientId = this.id; // by who
				String description = "client added an acount with id: " + newAccount.getId();
				float amount = newAccount.getBalance();
				Log addAccountLog = new Log(timestamp, clientId, description, amount);
				// 2. use the logger attribute to log (store) the Log object
				logger.log(addAccountLog);
				// === ================= ================
				break;
			}
		}
	}
	
	
	
	
	
	
	

}
