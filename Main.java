package ca.bcit.comp1451.ElizabethSorescu.JamesMoffat;

/**
 * @author Elizabeth Sorescu & James Moffat
 * @version 1.0
 * Lab7a&b
 */
public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		IPod 		ipod 		= new IPod(50, 90.50);
		IPad 		ipad 		= new IPad(true, "14.0.1");
		IPhone 		iphone 		= new IPhone(60.00, "Telus");
		
		
		ipod.printDetails();
		System.out.println(ipod.toString());
		ipad.printDetails();
		System.out.println(ipad.toString());
		iphone.printDetails();
		System.out.println(iphone.toString());
		
	}

}
