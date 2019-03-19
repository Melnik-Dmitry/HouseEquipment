package by.epam.javawebtraining.melnik.task01.createentityfromfile.splitstring;

import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.InvalidParameterException;
import by.epam.javawebtraining.melnik.task01.model.exception.technicexeption.NullLinkException;

public class StringSplit {

	 public static String[] splitString(String checkString, String regEx) throws InvalidParameterException {

		  if (checkString.isEmpty () || regEx.isEmpty ()) {
				throw new InvalidParameterException ();
		  }
		  if (checkString == null || regEx == null) {
				throw new InvalidParameterException ( new NullLinkException () );
		  }

		  return checkString.split ( regEx );
	 }
}
