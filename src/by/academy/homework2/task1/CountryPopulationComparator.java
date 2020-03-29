package by.academy.homework2.task1;

import java.util.Comparator;

 class CountryPopulationComparator implements Comparator<Country>{

    @Override
    public int compare(Country p1, Country p2) {
        if (p1.getPopulation() > p2.getPopulation()) {
            return 1;
        }
        if (p2.getPopulation() > p1.getPopulation()) {
            return 0;
        } else {
            return -1;
        }
    }


 }
