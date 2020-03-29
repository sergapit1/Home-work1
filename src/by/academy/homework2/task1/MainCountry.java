package by.academy.homework2.task1;

import static by.academy.homework2.task1.Country.ARGENTINA;
import static by.academy.homework2.task1.Country.CANADA;


public class MainCountry {
    public static void main(String[] args) {
        Country c1 = Country.BRAZIL;
        System.out.println(c1);

        Country c2 = Country.valueOf("ARGENTINA");
        System.out.println(c1 == c2);
        Country c3 = Country.ZAMBIA;
        System.out.println(c3.compareTo(c2));

        //  Country c4 = Country.valueOf("Belarus");
        //  System.out.println(c4);


        CountryAreaComparator comporatorSquare = new CountryAreaComparator();
        Country comporatorCoun1 = Country.SPAIN;
        Country comporatorCoun2 = Country.QATAR;
        int comporatorResult = comporatorSquare.compare(comporatorCoun1, comporatorCoun2);
        System.out.println(comporatorResult);

        if (comporatorResult == 1) {
            System.out.println("Square " + comporatorCoun1 + " more than " + comporatorCoun2);
        }
        if (comporatorResult == 0) {
            System.out.println("Square " + comporatorCoun2 + " more than " + comporatorCoun1);
        }


        CountryPopulationComparator comporatorPopulation = new CountryPopulationComparator();
        Country comporatorPopul1 = Country.SPAIN;
        Country comporatorPopul2 = Country.QATAR;
        int comporatorResultPopulation = comporatorPopulation.compare(comporatorPopul1, comporatorPopul2);
        System.out.println(comporatorResultPopulation);
        switch (comporatorResultPopulation) {
            case 0:
                System.out.println("Population " + comporatorPopul2 + " more than " + comporatorPopul1);
                break;
            case 1:
                System.out.println("Population " + comporatorPopul1 + " more than " + comporatorPopul2);
                break;
        }


       /*
        if (comporatorResultPopulation == 1) {
            System.out.println("Population " + comporatorPopul1 + " more than " + comporatorPopul2);
        }
        if (comporatorResultPopulation == 0) {
            System.out.println("Population " + comporatorPopul2 + " more than " + comporatorPopul1);
        }*/

    }


}
