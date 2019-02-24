package by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter;

import java.util.Random;

public class RandomInnerVolume implements RandomParameter {

    @Override
    public int makeValueParameter() {
        int param = new Random().nextInt(2);

        switch (param) {
            case 1:
                return 17;
            default:
                return 20;
        }
    }
}
