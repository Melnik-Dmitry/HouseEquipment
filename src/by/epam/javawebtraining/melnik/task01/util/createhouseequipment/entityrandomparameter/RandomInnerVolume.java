package by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter;

import java.util.Random;

public class RandomInnerVolume implements RandomParameter {

    public static final int AMOUNT_INNER_VOLUMES = 2;

    @Override
    public int makeValueParameter() {
        int param = new Random ().nextInt ( AMOUNT_INNER_VOLUMES );

        switch (param) {
            case 1:
                return 17;
            default:
                return 20;
        }
    }
}
