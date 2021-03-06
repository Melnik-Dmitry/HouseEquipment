package by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MicrowaveValidator implements HouseEquipmentValidator {

	 public static final String VALID_MICROWAVE = "([0-9]{3,4}\\s{1,}){2}(MICROWAVE)(\\s{1,})[0-9]{2}(\\s*)";

	 @Override
	 public boolean check(String checkedString) {

		  Pattern pattern = Pattern.compile ( VALID_MICROWAVE );
		  Matcher matcher = pattern.matcher ( checkedString );

		  return matcher.find ();
	 }
}