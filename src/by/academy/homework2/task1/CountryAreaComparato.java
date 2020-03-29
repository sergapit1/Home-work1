package by.academy.homework2.task1;

import java.util.Comparator;

 class CountryAreaComparator implements Comparator<Country> {


     @Override
     public int compare(Country o1, Country o2) {
         if (o1.getSquare() > o2.getSquare()) {
             return 1;
         }
         if (o2.getSquare() > o1.getSquare()) {
             return 0;
         } else {
             return -1;
         }
     }


 }