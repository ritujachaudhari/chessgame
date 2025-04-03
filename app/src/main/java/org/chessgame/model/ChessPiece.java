package org.chessgame.model;

import java.util.List;
import java.util.regex.Pattern;

public abstract class ChessPiece {
    protected final String position;
    protected final int row;
    protected final char col;

    public ChessPiece(String position) {
        this.position = position.toUpperCase();

        if(!isValidPosition(position))
            throw new IllegalArgumentException("Invalid position. Possible positions should contain row from A-H and column from 1-8");

        this.col = position.charAt(0);
        this.row = Character.getNumericValue(position.charAt(1));
    }

    public abstract List<String> getPossibleMoves();

    protected boolean isValidPosition(String position) {
        return Pattern.matches("[A-H][1-8]",position);
    }

    protected void addIfValid(List<String> moves, char col, int row) {
        String position = String.format("%c%d", col, row);
        if (isValidPosition(position)) {
            moves.add(position);
        }
    }
}
