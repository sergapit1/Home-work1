package by.academy.homework2.task1;

public enum Country implements ISquarePopulation {
    ARGENTINA(15000, 20000),
    BRAZIL(1116565, 45454545),
    CANADA(54654564, 789878),
    CHINA(54554645, 798768465),
    GERMANY(565646, 54450),
    NORWAY(45465421, 12132321),
    QATAR(1213, 798789),
    SPAIN(78987, 7854),
    SWEDEN(7898, 898798798),
    ZAMBIA(897542, 548798);

    public final int square;   // площадь
    public final int population; // население

    Country(int square, int population) {
        this.square = square;
        this.population = population;
    }


    @Override
    public int getSquare() {
        return square;
    }

    @Override
    public int getPopulation() {
        return population;
    }


}
