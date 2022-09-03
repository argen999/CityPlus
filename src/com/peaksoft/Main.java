package com.peaksoft;

public class Main {
    public static void main(String[] args) {
        // бул жерден эки шаардын калкын
        // консолго кошуп чыгарыныз
        City city1 = new City("Osh",239847);
        City city2 = new City("Bishkek",1233556);
        System.out.println(city1+"\n"+city2);
        System.out.println("The population of the two cities: "+city1.add(city2));




    }
}
