package ca.bcit.comp1451.jamesmoffat.zacharymartin.lab6a;

/**
 * @author James Moffat and Zachary Martin
 * @version 1.0
 * this class models a chess piece
 */
public class ChessPiece 
{
	private final int PAWN_VALUE   = 1;
	private final int KNIGHT_VALUE = 2;
	private final int BISHOP_VALUE = 3;
	private final int ROOK_VALUE   = 4;
	private final int QUEEN_VALUE  = 9;
	private final int KING_VALUE   = 1000;
	
	private boolean isPieceWhite;
	int value;
	
	/**
	 * @param isPieceWhite, true if the piece is white false if the piece is black
	 */
	public ChessPiece(boolean isPieceWhite)
	{
		this.isPieceWhite = isPieceWhite;
		setValue(); 
	}

	//getters setters
	
	/**
	 * @return the isPieceWhite boolean returns true if the piece is white, false if the piece is black
	 */
	public boolean isPieceWhite() 
	{
		return isPieceWhite;
	}

	/**
	 * @param isPieceWhite boolean true if the piece is white, false if the piece is black
	 */
	public void setPieceWhite(boolean isPieceWhite) 
	{
		this.isPieceWhite = isPieceWhite;
	}

	/**
	 * @return the value of the chess piece
	 */
	public int getValue() 
	{
		return value;
	}

	/**
	 * sets the value of the chess piece according to its piece identity
	 */
	public void setValue() 
	{
		if(this.getClass().getSimpleName().equals("Pawn"))
		{
			value = PAWN_VALUE;
		}
		else if(this.getClass().getSimpleName().equals("Knight"))
		{
			value = KNIGHT_VALUE;
		}
		else if(this.getClass().getSimpleName().equals("Bishop"))
		{
			value = BISHOP_VALUE;
		}
		else if(this.getClass().getSimpleName().equals("Rook"))
		{
			value = ROOK_VALUE;
		}
		else if(this.getClass().getSimpleName().equals("Queen"))
		{
			value = QUEEN_VALUE;
		}
		else if(this.getClass().getSimpleName().equals("King"))
		{
			value = KING_VALUE;
		}
	}
	
	//methods
	
	/**
	 * prints the movement of the piece
	 */
	public void move()
	{
		System.out.println("moving...");
	}
	
	/**
	 * overrides the toString() method
	 */
	@Override
	public String toString()
	{
		String pieceColor = "unknown";
		if(isPieceWhite == true)
		{
			pieceColor = "White";
		}
		else
		{
			pieceColor = "Black";
		}
		
		return pieceColor + " " + this.getClass().getSimpleName();
	}
	

}
