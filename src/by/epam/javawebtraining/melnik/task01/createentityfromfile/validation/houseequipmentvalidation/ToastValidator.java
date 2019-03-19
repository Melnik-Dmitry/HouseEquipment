package by.epam.javawebtraining.melnik.task01.createentityfromfile.validation.houseequipmentvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToastValidator implements HouseEquipmentValidator {

	 public static final String VALID_TOAST = "([0-9]{3,4}\\s{1,}){2}(TOAST)(\\s{1,})(true|false)(\\s*)";

	 @Override
	 public boolean check(String checkedString) {
		  Pattern pattern = Pattern.compile ( VALID_TOAST );
		  Matcher matcher = pattern.matcher ( checkedString );

		  return matcher.find ();
	 }
}
