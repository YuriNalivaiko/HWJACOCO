package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    public void shouldReturnMaxIncomes() {
        StatisticsService statisticsService = new StatisticsService();

        long[] incomes = {10, 20, 30, 40, 50};
        long expected = 50;
        long actual = statisticsService.findMax(incomes);
        Assertions.assertEquals(expected, actual);

        incomes = new long[]{100, 200, 300, 400, 500};
        expected = 500;
        actual = statisticsService.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}