package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldTotalSumSalesInYear() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.totalSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSalesPerMonthInYear() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSalesPerMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSalesPerMonthInYear(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;

        long actual = service.maxSalesPerMonth(sales);

        assertEquals(expected, actual);

    }
    @Test
    void shouldMinSalesPerMonthInYear(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.minSalesPerMonth(sales);

        assertEquals(expected, actual);

    }
    @Test
    void shouldCountMonthSalesLowerAverageInYear(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.countMonthSalesLowerAverage(sales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCountMonthSalesUpperAverageInYear(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.countMonthSalesUpperAverage(sales);

        assertEquals(expected, actual);
    }
}