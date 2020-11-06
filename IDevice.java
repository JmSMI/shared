package ca.bcit.comp1451.ElizabethSorescu.JamesMoffat;

/**
 * 
 * @author Elizabeth Sorescu & James Moffat
 * @version 1.0
 * Lab7a&b
 */
public abstract class IDevice {
	public static final int ONE = 1;
	public static final int THIRTY_ONE = 31;

	private String purpose;

	/**
	 * 
	 * @param purpose to set purpose
	 */
	public IDevice(String purpose) {
		this.purpose = purpose;
	}

	/**
	 * 
	 * @return purpose
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * abstract print details method
	 */
	public abstract void printDetails();
	
	/**
	 * to String method
	 */
	@Override
	public String toString() {
		return super.toString().substring(super.toString().lastIndexOf('.') + ONE) + "  The purpose of this " + this.getClass().getSimpleName() + " is " + purpose + ". ";
	}

	/**
	 * hash code method
	 */
	@Override
	public int hashCode() {
		final int prime = THIRTY_ONE;
		int result = ONE;
		result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
		return result;
	}

	/**
	 * equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IDevice other = (IDevice) obj;
		if (purpose == null) {
			if (other.purpose != null)
				return false;
		} else if (!purpose.equals(other.purpose))
			return false;
		return true;
	}

}
