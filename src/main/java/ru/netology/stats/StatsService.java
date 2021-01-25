package ru.netology.stats;

public class StatsService {
    public long totalSumSales(long[] sales){
        long sum = 0;
        for (long sale : sales){
            sum += sale;
        }
        return sum;
    }
    public long averageSalesPerMonth(long[] sales){
        long sum = 0;
        for (long sale : sales){
            sum += sale;
        }
        long average = sum / sales.length;
        return average;
    }
    public long maxSalesPerMonth(long [] sales) {
        long monthNow = 0;
        long monthMaxSale = 0;
        long maxSale = sales[0];
        for (long sale : sales) {
            if (sale >= maxSale) {
                maxSale = sale;
                monthMaxSale = monthNow;
            }
            monthNow++;
        }
        return monthMaxSale;
    }
    public long minSalesPerMonth(long [] sales) {
        long monthNow = 0;
        long monthMinSale = 0;
        long minSale = sales[0];
        for (long sale : sales) {
            if (sale <= minSale) {
                minSale = sale;
                monthMinSale = monthNow;
            }
            monthNow++;
        }
        return monthMinSale;
    }
    public long countMonthSalesLowerAverage(long[] sales) {
        long sum = 0;
        long countMoth = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long average = sum / sales.length;

        for (long sale : sales) {
            if (sale < average) {
                countMoth++;
            }
        }
        return countMoth;
    }
    public long countMonthSalesUpperAverage(long[] sales) {
        long sum = 0;
        long countMoth = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long average = sum / sales.length;

        for (long sale : sales) {
            if (sale > average) {
                countMoth++;
            }
        }
        return countMoth;
    }
}
