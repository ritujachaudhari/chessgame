package org.chessgame.model;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends ChessPiece {
    public Pawn(String position) {
        super(position);
    }

    @Override
    public List<String> getPossibleMoves() {
        List<String> moves = new ArrayList<>();
        if (row < 8) {
            addIfValid(moves, col, row + 1);
        }
        return moves;
    }
}
