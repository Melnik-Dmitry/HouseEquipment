package by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter;

import java.util.Random;

public class RandomAmountOfProgram implements RandomParameter {

    public static final int MIN_PROGRAM_AMOUNT = 5;
    public static final int MAX_PROGRAM_AMOUNT = 40;

    @Override
    public int makeValueParameter() {
        return new Random ().nextInt ( MIN_PROGRAM_AMOUNT ) + (MAX_PROGRAM_AMOUNT - MIN_PROGRAM_AMOUNT);
    }
}
