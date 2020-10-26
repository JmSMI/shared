package ca.bcit.comp1451.jamesmoffat.zacharymartin.lab6a;

/**
 * @author James Moffat and Zachary Martin
 * @version 1.0
 * this class models a pawn chess piece
 */
public class Pawn extends ChessPiece 
{

	/**
	 * @param white, true if the piece is white false if the piece is black
	 */
	public Pawn(boolean white) 
	{
		super(white);
	}
	
	//methods
	
	/**
	 * overrides the toString() method. Print class name, color, and value
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
		System.out.println("forward 1");
	}
}
