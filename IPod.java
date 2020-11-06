package ca.bcit.comp1451.ElizabethSorescu.JamesMoffat;

/**
 * 
 * @author Elizabeth Sorescu & James Moffat
 * @version 1.0
 * Lab7a&b
 */
public class IPod extends IDevice {

	public static final int THIRTY_ONE = 31;
	
	private int numberOfSongsStored;
	private double maxVolumeDecibels;

	/**
	 * @param numberOfSongsStored
	 * @param maxVolumeDecibels
	 */
	public IPod(int numberOfSongsStored, double maxVolumeDecibels) {
		super("music");
		this.numberOfSongsStored = numberOfSongsStored;
		this.maxVolumeDecibels = maxVolumeDecibels;
	}

	/**
	 * 
	 * @return number of songs stored
	 */
	public int getNumberOfSongsStored() {
		return numberOfSongsStored;
	}

	/**
	 * 
	 * @return maximum volume in decibels
	 */
	public double getMaxVolumeDecibels() {
		return maxVolumeDecibels;
	}

	/**
	 * 
	 * @param numberOfSongsStored to set number of songs stored
	 */
	public void setNumberOfSongsStored(int numberOfSongsStored) {
		this.numberOfSongsStored = numberOfSongsStored;
	}

	/**
	 * 
	 * @param maxVolumeDecibels to set maximum volume in decibels
	 */
	public void setMaxVolumeDecibels(double maxVolumeDecibels) {
		this.maxVolumeDecibels = maxVolumeDecibels;
	}

	/**
	 * print details method
	 */
	@Override
	public void printDetails() {
		System.out.println("Number Of Songs stored: " + numberOfSongsStored);
		System.out.println( "Maximum Volume: " + maxVolumeDecibels + " Decibels");
	}

	/**
	 * to String method
	 */
	@Override
	public String toString() {

		return super.toString() + " The number of songs stored is " + numberOfSongsStored
				+ " with maximum volume of " + maxVolumeDecibels + " Decibels.";
	}

	/**
	 * hashCode method
	 */
	@Override
	public int hashCode() {
		final int prime = THIRTY_ONE;
		int result = super.hashCode();
		result = prime * result + numberOfSongsStored;
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
		IPod other = (IPod) obj;
		if (numberOfSongsStored != other.numberOfSongsStored)
			return false;
		return true;
	}

	
}
