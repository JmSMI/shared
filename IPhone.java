package ca.bcit.comp1451.ElizabethSorescu.JamesMoffat;

/**
 * @author Elizabeth Sorescu & James Moffat
 * @version 1.0
 * Lab7a&b
 */
public class IPhone extends IDevice {

	public static final int THIRTY_TWO 	= 32;
	public static final int THIRTY_ONE 	= 31;
	public static final double TEN 		= 10;
	
	private double numberOfMinutesLeftInPlan;
	private String carrier;

	/**
	 * 
	 * @param numberOfMinutesLeftInPlan to set number of minutes left in plan
	 * @param carrier to set carrier
	 */
	public IPhone(double numberOfMinutesLeftInPlan, String carrier) {
		super("talking");
		this.numberOfMinutesLeftInPlan = numberOfMinutesLeftInPlan;
		this.carrier = carrier;
	}

	/**
	 * 
	 * @return number of minutes left in plan
	 */
	public double getNumberOfMinutesLeftInPlan() {
		return numberOfMinutesLeftInPlan;
	}

	/**
	 * 
	 * @return carrier
	 */
	public String getCarrier() {
		return carrier;
	}

	/**
	 * 
	 * @param numberOfMinutesLeftInPlan to set number of minutes left in plan
	 */
	public void setNumberOfMinutesLeftInPlan(double numberOfMinutesLeftInPlan) {
		this.numberOfMinutesLeftInPlan = numberOfMinutesLeftInPlan;
	}

	/**
	 * 
	 * @param carrier to set carrier
	 */
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	/**
	 * print details method
	 */
	@Override
	public void printDetails() {
		System.out.println("Number of minutes left in plan: " + numberOfMinutesLeftInPlan);
		System.out.println("Carrier: " + carrier);
	}

	/**
	 * to String method
	 */
	@Override
	public String toString() {

		return super.toString() + " The carrier is " + carrier + ", and the number of minutes left in its plan is "
				+ numberOfMinutesLeftInPlan +".";
	}

	/**
	 * hashcode method
	 */
	@Override
	public int hashCode() {
		final int prime = THIRTY_ONE;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(numberOfMinutesLeftInPlan);
		result = prime * result + (int) (temp ^ (temp >>> THIRTY_TWO));
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
		IPhone other = (IPhone) obj;
		if ((Double.doubleToLongBits(numberOfMinutesLeftInPlan) != Double
				.doubleToLongBits(other.numberOfMinutesLeftInPlan)) || (Math.abs(numberOfMinutesLeftInPlan) >  TEN))
			return false;
		return true;
		
	}
	


}
