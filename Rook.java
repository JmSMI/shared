package ca.bcit.comp1451.jamesmoffat.zacharymartin.lab6a;

/**
 * @author James Moffat and Zachary Martin
 * @version 1.0
 * this class models a rook chess piece
 */
public class Rook extends ChessPiece 
{

	/**
	 * @param isPieceWhite, true if the piece is white false if the piece is black
	 */
	public Rook(boolean isPieceWhite) 
	{
		super(isPieceWhite);
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
		System.out.println("horizontally or vertically");
	}

}
