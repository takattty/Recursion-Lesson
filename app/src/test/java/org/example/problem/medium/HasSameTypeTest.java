package org.example.problem.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HasSameTypeTest {
    @ParameterizedTest(name = "{0}と{1}のパターンマッチング")
    // ここのCSVは型の恩恵がない
    @CsvSource({
            "aabb,  yyza,   false",
            "aappl, bbtte,  true",
            "aabb,  abab,   false",
            "aappl, bbttb,  false"
    })
    void hasSameType(String pattern, String target, boolean expected) {
        boolean actual = HasSameType.hasSameType(pattern, target);
        assertEquals(expected, actual);
    }
}