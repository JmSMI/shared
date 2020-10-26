package ca.bcit.comp1451.jamesmoffat.zacharymartin.lab6a;

/**
 * @author James Moffat and Zachary Martin
 * @version 1.0
 * this class models a bishop chess piece
 */
public class Bishop extends ChessPiece 
{

	/**
	 * @param white, true if the piece is white false if the piece is black
	 */
	public Bishop(boolean white) 
	{
		super(white);
	}
	
	
	//methods
	
	/**
	 * overrides the toString() method
	 */
	@Override
	public String toString()
	{
		return super.toString() + "(" + getValue() + ")";
	}
	
	
	/**
	 * prints how this particular piece moves
	 */
	@Override
	public void move()
	{
		System.out.println("diagonally");
	}

}
