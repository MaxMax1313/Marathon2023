package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece rook = ChessPiece.ROOK_BLACK;
        ChessPiece pawn = ChessPiece.PAWN_WHITE;
        ChessPiece [] chess=new  ChessPiece[8];

        for (int i = 0; i < 4; i++) {
            chess[i] = pawn;
        }
        for (int i = 4; i < 8; i++) {
            chess[i] = rook;
        }

        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i].getType() + " ");

        }

    }
}