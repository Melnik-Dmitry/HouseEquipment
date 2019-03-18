package by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MicrowaveValidator implements HouseEquipmentValidator {

	 public static final String VALID_MICROWAVE = "([0-9]{3,4}\\s{1,}){2}(MICROWAWE)(\\s{1,})[0-9]{2}(\\s{1,})";

	 @Override
	 public String check(String checkedString, String regEx) {

		  Pattern pattern = Pattern.compile ( VALID_MICROWAVE );
		  Matcher matcher = pattern.matcher ( checkedString );
		  
		  return null;
	 }
}
