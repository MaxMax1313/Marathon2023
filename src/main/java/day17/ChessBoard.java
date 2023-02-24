package day17;

import java.util.Arrays;

public class ChessBoard {
    ChessPiece [][] chessPieces = null;
    ChessBoard(ChessPiece [][] chessPieces){

        this.chessPieces = chessPieces;
    }


    public void print() {
        for (int i = 0; i < chessPieces.length; i++) {
            for (int j = 0; j < chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j].getType());

            }
            System.out.println();

        }
    }




}


