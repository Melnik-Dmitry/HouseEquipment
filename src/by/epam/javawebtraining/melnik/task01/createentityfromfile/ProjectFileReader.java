package by.epam.javawebtraining.melnik.task01.createentityfromfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static by.epam.javawebtraining.melnik.task01.controller.ApplicationController.appLogger;

public class ProjectFileReader {

	 public static String readFile(String filePath) {

		  BufferedReader bufferedReader = null;
		  StringBuilder builder = null;

		  try {
				bufferedReader = new BufferedReader ( new FileReader ( filePath ) );
				builder = new StringBuilder ();

				String readedString = "";
				while ((readedString = bufferedReader.readLine ()) != null) {
					 builder.append ( readedString );
				}
		  } catch (FileNotFoundException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } catch (IOException e) {
				appLogger.error ( e );
				e.printStackTrace ();
		  } finally {
				try {
					 if (bufferedReader != null) {
						  bufferedReader.close ();
					 }
				} catch (IOException e) {
					 appLogger.error ( e );
				}
		  }

		  return builder.toString ();
	 }
}
