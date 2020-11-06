package ca.bcit.comp1451.ElizabethSorescu.JamesMoffat;

/**
 * 
 * @author Elizabeth Sorescu & James Moffat
 * @version 1.0
 * Lab7a&b
 */
public class IPad extends IDevice {

	public static final int THIRTY_ONE = 31;
	
	private boolean hasCase;
	private String OSVersion;

	/**
	 * 
	 * @param hasCase to set true if ipad has case; otherwise false
	 * @param OSVersion to set OS version
	 */
	public IPad(boolean hasCase, String OSVersion) {
		super("learning");
		this.hasCase = hasCase;
		this.OSVersion = OSVersion;
	}

	/**
	 * 
	 * @return true if ipad has case otherwise false
	 */
	public boolean isHasCase() {
		return hasCase;
	}

	/**
	 * 
	 * @return OS version
	 */
	public String getOSVersion() {
		return OSVersion;
	}

	/**
	 * 
	 * @param hasCase to set to true if ipad has case otherwise false
	 */
	public void setHasCase(boolean hasCase) {
		this.hasCase = hasCase;
	}

	/**
	 * 
	 * @param OSVersion to set OS version
	 */
	public void setOSVersion(String oSVersion) {
		OSVersion = oSVersion;
	}

	/**
	 * print details method
	 */
	@Override
	public void printDetails() {
		System.out.println("Has case: " + hasCase);
		System.out.println("OS Version: " + OSVersion);
	}

	/**
	 * to String method
	 */
	@Override
	public String toString() {
		String withCase = null;
		if (hasCase == true)
		{
			withCase = "has a case";
		}else {
			withCase = "has no case";
		}

		return super.toString() + " It's operating system version is " + OSVersion + " and it " + withCase + ".";
	}

	/**
	 * hashCode method
	 */
	@Override
	public int hashCode() {
		final int prime = THIRTY_ONE;
		int result = super.hashCode();
		result = prime * result + ((OSVersion == null) ? 0 : OSVersion.hashCode());
		return result;
	}

	/**
	 * equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		IPad other = (IPad) obj;
		if (OSVersion == null) {
			if (other.OSVersion != null)
				return false;
		} else if (!OSVersion.equals(other.OSVersion))
			return false;
		return true;
	}
	
	
}
