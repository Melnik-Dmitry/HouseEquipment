package by.epam.javawebtraining.melnik.task01.util.createhouseequipment.entityrandomparameter;

import java.util.Random;

public class RandomInnerVolume implements RandomParameter {

	 @Override
	 public int makeValueParameter() {

		  int innerVolume = 0;

		  if (new Random ().nextBoolean ()) {
				innerVolume = 17;
		  } else {
				innerVolume = 20;
		  }
		  return innerVolume;
	 }
}
