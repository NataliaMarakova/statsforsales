package ru.netology.stats;

public class StatsService {
    public long getSumOfAllSales(long[] sales) {
        long sumOfAllSales = 0;
        for (long sale : sales) {
            sumOfAllSales = sumOfAllSales + sale;
        }
        return sumOfAllSales;
    }

    public long getAverageSumOfAllSales(long[] sales) {
        //{long sumOfAllSales = 0;
        //for (long sale : sales) {
        //sumOfAllSales = sumOfAllSales + sale;}
        long sumOfAllSales = getSumOfAllSales(sales);
        long averageSumOfAllSales = sumOfAllSales / 12;
        return averageSumOfAllSales;

    }

    public int getMaxSalesMonth(long[] sales) {
        int maxSalesMonth = 0;


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesMonth]) {
                maxSalesMonth = i;

            }
        }
        return maxSalesMonth + 1;
    }

    public int getMinSalesMonth(long[] sales) {
        int minSalesMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesMonth]) {
                minSalesMonth = i;

            }
        }
        return minSalesMonth + 1;
    }

    public int getNumberOfMonthsBelowAverage(long[] sales) {
        int countMonthsBelowAverage = 0;

        for (long sale : sales) {
            if (sale < getAverageSumOfAllSales(sales)) {
                countMonthsBelowAverage++;
            }
        }
        return countMonthsBelowAverage;

    }

    public int getNumberOfMonthsAboveAverage(long[] sales) {
        int countMonthsAboveAverage = 0;

        for (long sale : sales) {
            if (sale < getAverageSumOfAllSales(sales)) {
                countMonthsAboveAverage++;
            }
        }
        return countMonthsAboveAverage;

    }
}

