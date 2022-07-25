package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);


    }

    // Test Case 구현
    @Test
    @DisplayName("set테스트")
    void setTest() {
        int actual = numbers.size();
        assertThat(actual).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains_ShouldReturnTrueForTheNumbers(int number) {
        assertTrue(numbers.contains(number));
    }

    @ParameterizedTest
    @CsvSource({"1, true", "2, true", "4, false", "5, false"})
    void contains_ShouldReturnExpectedValue(int input, Boolean expected) {
        Boolean actualValue = numbers.contains(input);
        assertEquals(expected, actualValue);
    }





}