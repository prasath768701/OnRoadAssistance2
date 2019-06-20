package constants;

/**
 * This is class contains the constants declaration for all success scenarios
 * 
 * @author t-Renjith
 * 
 */
public final class SuccessConstants {
	
	private SuccessConstants()
	{
		new SuccessConstants();
	}
	/**
	 * The success messages property file name
	 */
	public static final String SUCCESSMESSAGES = "successmessages";
	/**
	 * The login success message key
	 */
	public static final String LOGINSUCCESS = "login.success";
	/**
	 *The success page which is to be shown on login success
	 * 
	 */
	public static final String SUCCESSPAGE = "UserController?action=listUser";
	/**
	 * The admin page of the application
	 */
	public static final String ADMINPAGE = "adminhome.jsp";
	/**
	 * The success page to be shown on successful addition of course details
	 */
	public static final String ADDSUCCESS = "success.jsp";
	/**
	 * Key for the addition success message
	 */
	public static final String ADD_OK_MESSAGE = "addition.success";
	/**
	 * The log4j properties file
	 */
	public static final String LOG4J_FILE = "/WEB-INF/log4j.properties";
	/**
	 *The success page which is to be shown on login success
	 * 
	 */
	public static final String SUCCESSPAGE_USER = "RLController";
}
