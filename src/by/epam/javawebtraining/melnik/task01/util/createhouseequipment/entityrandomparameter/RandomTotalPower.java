package by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter;

import java.util.Random;

public class RandomTotalPower implements RandomParameter {

    public static final int MIN_TOTAL_POWER = 1300;
    public static final int MAX_TOTAL_POWER = 2000;

    @Override
    public int makeValueParameter() {
        return (new Random().nextInt(MIN_TOTAL_POWER) + (MAX_TOTAL_POWER - MIN_TOTAL_POWER));
    }
}
