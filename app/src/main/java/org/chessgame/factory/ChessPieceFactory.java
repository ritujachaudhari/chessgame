package org.chessgame.factory;

import org.chessgame.model.*;

public class ChessPieceFactory {
    public static ChessPiece createChessPiece(PieceType pieceType, String position) {
        switch (pieceType) {
            case PieceType.PAWN:
                return new Pawn(position);
            case PieceType.KING:
                return new King(position);
            case PieceType.QUEEN:
                return new Queen(position);
            default:
                throw new IllegalArgumentException("Unsupported piece type. Use Pawn, King, or Queen");
        }
    }
}