package com.peaksoft;

public class City implements Summable{
    private int population;
    private String name;

    public City(String name, int population) {
        this.population = population;
        this.name = name;
    }


    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    @Override
    public int add(Summable other) {
        // метод логикасын жазыныз
        return getValue() + other.getValue();
    }

    @Override
    public int getValue() {
        // метод логикасын жазыныз
        return getPopulation();
    }

    @Override
    public String toString() {
        return name + " population is: " + population;
    }
}
