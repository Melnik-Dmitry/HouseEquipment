package by.epam.javawebtraining.melnik.task01.util.createentity.createhouseequipment.entityrandomparameter;

import java.util.Random;

public class RandomAmountOfProgram implements RandomParameter {

    @Override
    public int makeValueParameter() {
        return new Random().nextInt(6) + 35;
    }
}
