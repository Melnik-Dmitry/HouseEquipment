package by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MulticookerValidator implements HouseEquipmentValidator {

	 public static final String VALID_MULTICOOKER = "([0-9]{3,4}\\s{1,}){2}(MULTICOOKER)(\\s{1,})[0-9]{1,2}(\\s*)";

	 @Override
	 public boolean check(String checkedString) {

		  Pattern pattern = Pattern.compile ( VALID_MULTICOOKER );
		  Matcher matcher = pattern.matcher ( checkedString );

		  return matcher.find ();
	 }
}
