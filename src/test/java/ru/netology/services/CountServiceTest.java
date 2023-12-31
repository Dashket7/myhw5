package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CountServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void calcCount(int expected, int income, int expenses, int threshold) {
        CountService service = new CountService();
        //int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
