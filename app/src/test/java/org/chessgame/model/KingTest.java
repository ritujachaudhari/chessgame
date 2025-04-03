package org.chessgame.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class KingTest {

    @Test
    void should_get_possible_moves_when_king_is_at_middle_position_D5() {
        King king = new King("D5");
        List<String> actualResult = king.getPossibleMoves();
        List<String> expectedResult = List.of("C4","C5","C6","D4","D6","E4","E5","E6");
        assertThat(actualResult.size()).isEqualTo(expectedResult.size());
        assertThat(actualResult).containsExactlyInAnyOrderElementsOf(expectedResult);
    }

    @Test
    void should_get_possible_moves_when_king_is_at_corner_position_H1() {
        King king = new King("H1");
        List<String> actualResult = king.getPossibleMoves();
        List<String> expectedResult = List.of("G1","G2","H2");
        assertThat(actualResult.size()).isEqualTo(expectedResult.size());
        assertThat(actualResult).containsExactlyInAnyOrderElementsOf(expectedResult);
    }

    @Test
    void should_get_possible_moves_when_king_is_at_last_row_position_H5() {
        King king = new King("H5");
        List<String> actualResult = king.getPossibleMoves();
        List<String> expectedResult = List.of("G4","G5","G6","H4","H6");
        assertThat(actualResult.size()).isEqualTo(expectedResult.size());
        assertThat(actualResult).containsExactlyInAnyOrderElementsOf(expectedResult);
    }
}