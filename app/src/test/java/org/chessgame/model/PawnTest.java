package org.chessgame.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PawnTest {

    @Test
    void should_get_possible_moves_when_pawn_is_at_start_position_D1() {
        Pawn pawn = new Pawn("D1");
        List<String> actualResult = pawn.getPossibleMoves();
        assertThat(actualResult).containsExactlyInAnyOrderElementsOf(List.of("D2"));
    }

    @Test
    void should_get_possible_moves_when_pawn_is_at_middle_position_D5() {
        Pawn pawn = new Pawn("D5");
        List<String> actualResult = pawn.getPossibleMoves();
        assertThat(actualResult).containsExactlyInAnyOrderElementsOf(List.of("D6"));
    }

    @Test
    void should_get_possible_moves_when_pawn_is_at_last_position_D8() {
        Pawn pawn = new Pawn("D8");
        List<String> actualResult = pawn.getPossibleMoves();
        assertThat(actualResult).containsExactlyInAnyOrderElementsOf(List.of());
    }
}