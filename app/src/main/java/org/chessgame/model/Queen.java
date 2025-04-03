package org.chessgame.model;

import java.util.ArrayList;
import java.util.List;

public class Queen extends ChessPiece {
    public Queen(String position) {
        super(position);
    }

    @Override
    public List<String> getPossibleMoves() {
        List<String> moves = new ArrayList<>();

        // Horizontal and vertical moves
        for (char c = 'A'; c <= 'H'; c++) {
            if (c != col) {
                addIfValid(moves, c, row);
            }
        }
        for (int r = 1; r <= 8; r++) {
            if (r != row) {
                addIfValid(moves, col, r);
            }
        }

        // Diagonal moves
        for (int i = 1; i <= 8; i++) {
            addIfValid(moves, (char)(col + i), row + i);
            addIfValid(moves, (char)(col + i), row - i);
            addIfValid(moves, (char)(col - i), row + i);
            addIfValid(moves, (char)(col - i), row - i);
        }

        return moves;
    }
}