package org.chessgame.model;

import java.util.ArrayList;
import java.util.List;

public class King extends ChessPiece {
    public King(String position) {
        super(position);
    }

    @Override
    public List<String> getPossibleMoves() {
        List<String> moves = new ArrayList<>();
        for (int r = row - 1; r <= row + 1; r++) {
            for (char c = (char)(col - 1); c <= col + 1; c++) {
                if (!(c == col && r == row)) { // Exclude current position
                    addIfValid(moves, c, r);
                }
            }
        }
        return moves;
    }
}
