package bank.system.core;

/**
 * 
 * @author Eldar
 * 
 * A Logger object is used for storing Log objects in some repository (database, file, console)
 *
 */
public class Logger {
	
	private String driverName;
	
	public Logger(String driverName) {
		this.driverName = driverName;
	}
	
	/**
	 * print Log on screen
	 * @param log the log object to be stored (printed to screen)
	 */
	public void log(Log log) {
		System.out.println(log.getData());
	}
	
	/**
	 * The getLogs method is not yet supported.
	 * @return All logs stored in the system (for now returns null)
	 */
	public Log[] getLogs() {
		return null;
	}

}
