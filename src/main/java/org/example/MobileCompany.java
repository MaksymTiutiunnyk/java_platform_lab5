package org.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Class representing a mobile company that manages a list of tariffs.
 */
public class MobileCompany {
    private final Tariff[] tariffs;

    /**
     * Constructor for creating a mobile company with an array of tariffs.
     *
     * @param tariffs array of tariffs
     */
    public MobileCompany(Tariff[] tariffs) {
        this.tariffs = tariffs;
    }

    /**
     * Calculates the total number of clients subscribed to all tariffs.
     *
     * @return the total number of clients
     */
    public int calculateTotalClients() {
        return Arrays.stream(tariffs).mapToInt(Tariff::getNumberOfClients).sum();
    }

    /**
     * Sorts the array of tariffs by their monthly fee in ascending order.
     */
    public void sortTariffsByMonthlyFee() {
        Arrays.sort(tariffs, Comparator.comparingDouble(Tariff::getMonthlyFee));
    }

    /**
     * Finds tariffs within a given monthly fee range.
     *
     * @param minFee minimum fee value
     * @param maxFee maximum fee value
     * @return array of tariffs within the fee range
     */
    public Tariff[] findTariffByFeeRange(double minFee, double maxFee) {
        return Arrays.stream(tariffs)
                .filter(tariff -> tariff.getMonthlyFee() >= minFee && tariff.getMonthlyFee() <= maxFee)
                .toArray(Tariff[]::new);
    }

    /**
     * Prints all tariffs to the console.
     */
    public void printTariffs() {
        Arrays.stream(tariffs).forEach(System.out::println);
    }

    /**
     * Prints the provided array of tariffs to the console.
     *
     * @param tariffs array of tariffs to print
     */
    public void printTariffs(Tariff[] tariffs) {
        Arrays.stream(tariffs).forEach(System.out::println);
    }
}
