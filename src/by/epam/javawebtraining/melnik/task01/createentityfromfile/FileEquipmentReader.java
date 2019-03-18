package by.epam.javawebtraining.melnik.task01.createentityfromfile;

import by.epam.javawebtraining.melnik.task01.createentityfromfile.splitstring.StringSplit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEquipmentReader {

	 public static String readFile(String filePath) throws IOException {

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
				e.printStackTrace ();
		  } finally {
				bufferedReader.close ();
		  }

		  return builder.toString ();
	 }

	 public static void main(String[] args) {
		  String path = "D:\\Java\\EPAM\\WebTraining\\HouseEquipment\\src\\by\\epam\\javawebtraining\\melnik\\task01" +
					 "\\createentityfromfile\\HouseEquipmentsFile.txt";

		  String sd = "";

		  try {
				sd = FileEquipmentReader.readFile ( path );
		  } catch (IOException e) {
				e.printStackTrace ();
		  }

		  String [] cv = StringSplit.splitString ( sd, "\\." );


		  System.out.println ();
	 }
}
