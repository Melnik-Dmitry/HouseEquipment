package by.epam.javawebtraining.melnik.task01.util.createentity.createhouseequipment.entityrandomparameter;

import java.util.Random;

public class RandomTotalPower implements RandomParameter {
//
//    public static int createTotalPower() {
//        return (new Random().nextInt(1300) + 700);
//    }

    @Override
    public int makeValueParameter() {
        return (new Random().nextInt(1300) + 700);
    }
}
