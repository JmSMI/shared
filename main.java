/**
 * 
 */
package ca.bcit.comp1451.jamesmoffat.zacharymartin.lab6a;

import java.util.ArrayList;

/**
 * @author James Moffat and Zachary Martin
 * @version 1.0
 * main method
 */
public class main 
{

	/**
	 * main method. prints the chess board
	 */
	public static void main(String[] args) 
	{
		//testing things: hybrid print calls
		//Pawn pawn = new Pawn(true);
		//System.out.println(pawn.getClass().getSimpleName());
		//System.out.println(pawn.getClass().getSimpleName().equals("Pawn"));
		//Knight knight = new Knight(true);
		//Bishop bishop = new Bishop(true);
		//Rook rook = new Rook(true);
		//Queen queen = new Queen(true);
		//King king = new King(true);
		
		ChessPiece[][] chessPieces = new ChessPiece[8][8];
		chessPieces[0][0] = new Rook(false);
		chessPieces[0][1] = new Knight(false);
		chessPieces[0][2] = new Bishop(false);
		chessPieces[0][3] = new Queen(false);
		chessPieces[0][4] = new King(false);
		chessPieces[0][5] = new Bishop(false);
		chessPieces[0][6] = new Knight(false);
		chessPieces[0][7] = new Rook(false);
		chessPieces[1][0] = new Pawn(false);
		chessPieces[1][1] = new Pawn(false);
		chessPieces[1][2] = new Pawn(false);
		chessPieces[1][3] = new Pawn(false);
		chessPieces[1][4] = new Pawn(false);
		chessPieces[1][5] = new Pawn(false);
		chessPieces[1][6] = new Pawn(false);
		chessPieces[1][7] = new Pawn(false);
		
		chessPieces[6][0] = new Pawn(true);
		chessPieces[6][1] = new Pawn(true);
		chessPieces[6][2] = new Pawn(true);
		chessPieces[6][3] = new Pawn(true);
		chessPieces[6][4] = new Pawn(true);
		chessPieces[6][5] = new Pawn(true);
		chessPieces[6][6] = new Pawn(true);
		chessPieces[6][7] = new Pawn(true);
		chessPieces[7][0] = new Rook(true);
		chessPieces[7][1] = new Knight(true);
		chessPieces[7][2] = new Bishop(true);
		chessPieces[7][3] = new Queen(true);
		chessPieces[7][4] = new King(true);
		chessPieces[7][5] = new Bishop(true);
		chessPieces[7][6] = new Knight(true);
		chessPieces[7][7] = new Rook(true);
		
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
