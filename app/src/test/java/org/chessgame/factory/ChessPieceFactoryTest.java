package org.chessgame.factory;

import org.chessgame.model.King;
import org.chessgame.model.Pawn;
import org.chessgame.model.Queen;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.chessgame.model.PieceType.*;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class ChessPieceFactoryTest {
    @Test
    void should_get_correct_piece_instance_when_passing_piece_type() {
        assertThat(ChessPieceFactory.createChessPiece(PAWN, "A1")).isInstanceOf(Pawn.class);
        assertThat(ChessPieceFactory.createChessPiece(KING, "B2")).isInstanceOf(King.class);
        assertThat(ChessPieceFactory.createChessPiece(QUEEN, "C3")).isInstanceOf(Queen.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "A", "A9", "I1", "A0", "a1", "A 1"})
    void testInvalidPositions(String position) {
        assertThrowsExactly(
                IllegalArgumentException.class,
                () -> new Pawn(position),
                "Invalid position. Possible positions should contain row from A-H and column from 1-8"
        );
    }

}