/**
 * 
 */
package ca.bcit.comp1451.jamesmoffat.zacharymartin.lab6a;


/**
 * @author James Moffat and Zachary Martin
 * @version 1.0
 * main method
 */
public class Main 
{
	public static final int MAX_ARRAY_LENGTH = 8;
	public static final int BLACK_PIECE_ROW  = 0;
	public static final int BLACK_PAWN_ROW   = 1;
	public static final int WHITE_PAWN_ROW   = 6;
	public static final int WHITE_PIECE_ROW  = 7;
	
	public static final int QUEEN = 3;
	public static final int KING  = 4;
	
	public static final int FIRST_ROOK    = 0;
	public static final int FIRST_KNIGHT  = 1;
	public static final int FIRST_BISHOP  = 2;
	public static final int SECOND_ROOK   = 7;
	public static final int SECOND_KNIGHT = 6;
	public static final int SECOND_BISHOP = 5;
	
	public static final int FIRST_PAWN   = 0;
	public static final int SECOND_PAWN  = 1;
	public static final int THIRD_PAWN   = 2;
	public static final int FOURTH_PAWN  = 3;
	public static final int FIFTH_PAWN   = 4;
	public static final int SIXTH_PAWN   = 5;
	public static final int SEVENTH_PAWN = 6;
	public static final int EIGTH_PAWN   = 7;

	/**
	 * main method. prints the chess board
	 */
	public static void main(String[] args) 
	{
		ChessPiece[][] chessPieces = new ChessPiece[MAX_ARRAY_LENGTH][MAX_ARRAY_LENGTH];
		chessPieces[WHITE_PIECE_ROW][FIRST_ROOK]    = new Rook(true);
		chessPieces[WHITE_PIECE_ROW][FIRST_KNIGHT]  = new Knight(true);
		chessPieces[WHITE_PIECE_ROW][FIRST_BISHOP]  = new Bishop(true);
		chessPieces[WHITE_PIECE_ROW][QUEEN]         = new Queen(true);
		chessPieces[WHITE_PIECE_ROW][KING]          = new King(true);
		chessPieces[WHITE_PIECE_ROW][SECOND_BISHOP] = new Bishop(true);
		chessPieces[WHITE_PIECE_ROW][SECOND_KNIGHT] = new Knight(true);
		chessPieces[WHITE_PIECE_ROW][SECOND_ROOK]   = new Rook(true);
		chessPieces[WHITE_PAWN_ROW][FIRST_PAWN]     = new Pawn(true);
		chessPieces[WHITE_PAWN_ROW][SECOND_PAWN]    = new Pawn(true);
		chessPieces[WHITE_PAWN_ROW][THIRD_PAWN]     = new Pawn(true);
		chessPieces[WHITE_PAWN_ROW][FOURTH_PAWN]    = new Pawn(true);
		chessPieces[WHITE_PAWN_ROW][FIFTH_PAWN]     = new Pawn(true);
		chessPieces[WHITE_PAWN_ROW][SIXTH_PAWN]     = new Pawn(true);
		chessPieces[WHITE_PAWN_ROW][SEVENTH_PAWN]   = new Pawn(true);
		chessPieces[WHITE_PAWN_ROW][EIGTH_PAWN]     = new Pawn(true);
		
		chessPieces[BLACK_PIECE_ROW][FIRST_ROOK]    = new Rook(false);
		chessPieces[BLACK_PIECE_ROW][FIRST_KNIGHT]  = new Knight(false);
		chessPieces[BLACK_PIECE_ROW][FIRST_BISHOP]  = new Bishop(false);
		chessPieces[BLACK_PIECE_ROW][QUEEN]         = new Queen(false);
		chessPieces[BLACK_PIECE_ROW][KING]          = new King(false);
		chessPieces[BLACK_PIECE_ROW][SECOND_BISHOP] = new Bishop(false);
		chessPieces[BLACK_PIECE_ROW][SECOND_KNIGHT] = new Knight(false);
		chessPieces[BLACK_PIECE_ROW][SECOND_ROOK]   = new Rook(false);
		chessPieces[BLACK_PAWN_ROW][FIRST_PAWN]     = new Pawn(false);
		chessPieces[BLACK_PAWN_ROW][SECOND_PAWN]    = new Pawn(false);
		chessPieces[BLACK_PAWN_ROW][THIRD_PAWN]     = new Pawn(false);
		chessPieces[BLACK_PAWN_ROW][FOURTH_PAWN]    = new Pawn(false);
		chessPieces[BLACK_PAWN_ROW][FIFTH_PAWN]     = new Pawn(false);
		chessPieces[BLACK_PAWN_ROW][SIXTH_PAWN]     = new Pawn(false);
		chessPieces[BLACK_PAWN_ROW][SEVENTH_PAWN]   = new Pawn(false);
		chessPieces[BLACK_PAWN_ROW][EIGTH_PAWN]     = new Pawn(false);
		
		for(int row = 0; row < chessPieces.length; row ++)
		{
			for(int column = 0; column < chessPieces[row].length; column++)
			{
				if(chessPieces[row][column] != null)
				{
				System.out.print(chessPieces[row][column].toString() + " ");
				}
			}
			System.out.println();
		}
	}
	
}
