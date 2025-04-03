package org.chessgame.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class QueenTest {
    @Test
    void should_get_possible_moves_when_queen_is_at_middle_position_D5() {
        Queen queen = new Queen("D5");
        List<String> actualResult = queen.getPossibleMoves();
        List<String> expectedResult = List.of("D1","D2","D3","D4","D6","D7","D8","A5","B5","C5","E5","F5","G5","H5","E6","F7","G8","E4","F3","G2","H1","C4","B3","A2","C6","B7","A8");
        assertThat(actualResult.size()).isEqualTo(expectedResult.size());
        assertThat(actualResult).containsExactlyInAnyOrderElementsOf(expectedResult);
    }

    @Test
    void should_get_possible_moves_when_queen_is_at_corner_position_H1() {
        Queen queen = new Queen("H1");
        List<String> actualResult = queen.getPossibleMoves();
        List<String> expectedResult = List.of("H2","H3","H4","H5","H6","H7","H8","A1","B1","C1","D1","E1","F1","G1","G2","F3","E4","D5","C6","B7","A8");
        assertThat(actualResult.size()).isEqualTo(expectedResult.size());
        assertThat(actualResult).containsExactlyInAnyOrderElementsOf(expectedResult);
    }

    @Test
    void should_get_possible_moves_when_queen_is_at_first_column_position_D1() {
        Queen queen = new Queen("D1");
        List<String> actualResult = queen.getPossibleMoves();
        List<String> expectedResult = List.of("D2","D3","D4","D5","D6","D7","D8","A1","B1","C1","E1","F1","G1","H1","E2","F3","G4","H5","C2","B3","A4");
        assertThat(actualResult.size()).isEqualTo(expectedResult.size());
        assertThat(actualResult).containsExactlyInAnyOrderElementsOf(expectedResult);
    }

    @Test
    void should_get_possible_moves_when_queen_is_at_last_column_position_C8() {
        Queen queen = new Queen("C8");
        List<String> actualResult = queen.getPossibleMoves();
        List<String> expectedResult = List.of("C1","C2","C3","C4","C5","C6","C7","A8","B8","D8","E8","F8","G8","H8","D7","E6","F5","G4","H3","B7","A6");
        assertThat(actualResult.size()).isEqualTo(expectedResult.size());
        assertThat(actualResult).containsExactlyInAnyOrderElementsOf(expectedResult);
    }
}