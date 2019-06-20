package constants;

/**
 * This is class contains the constants declaration for all success scenarios
 * 
 * @author t-Renjith
 * 
 */
public final class Constants {

	private Constants() {
		new Constants();
	}

	public static final String DEFAULT_PASSWORD = "password";
	public static final String DEFAULT_ROLE = "EMPLOYEE";
	public static final String CLOSED = "Closed";
	public static final String OPEN = "Open";
	public static final String DELEMP = "Delete operation can not be performed for this BU as there are Employees mapped to this BU. Please reassign the Employees before performing the operation.";
	/**
	 * The label properties file name
	 */
	public static final String UITEXT = "UIText";
	/**
	 * The SQL query for getting the user details for user validation
	 * 
	 */
	public static final String EXCEPTION = "Application has encountered a fatal error.Please check with the Adminstrator or try again later";
	
}
